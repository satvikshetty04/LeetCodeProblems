package easy;


/*
 * Suppose you have a long flowerbed in which some of the plots are planted and 
 * some are not. However, flowers cannot be planted in adjacent plots - they 
 * would compete for water and both would die. 
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means 
 * empty and 1 means not empty), and a number n, return if n new flowers can be 
 * planted in it without violating the no-adjacent-flowers rule.
 */
public class CanPlaceFlowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1,0,0}, 2));
	}
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		if(flowerbed == null)
			return false;
		int len = flowerbed.length;
		if(n == 0)
			return true;
		if(len == 1) 
			if(flowerbed[0] == 1 || n>1)
				return false;
			else return true;
		if(flowerbed[0] == 0 && flowerbed[1] == 0){
			flowerbed[0] = 1;
			n--;
		}
		for(int i = 0; i<len-2; i++){
			System.out.println(i);
			if(flowerbed[i]  == 0 && flowerbed[i+1] == 0 && flowerbed[i+2] == 0){
				flowerbed[i + 1] = 1;
				n--;
				i++;
			}
			if(n == 0)
				break;
		}
		if(len>=3 && flowerbed[len-3]  == 1 && flowerbed[len-2] == 0 && flowerbed[len-1] == 0)
			n--;
		if(n < 0)
			return true;
		return false;
	}

}
