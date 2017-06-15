package easy;

import java.util.ArrayList;
import java.util.HashMap;

/*
 *  Suppose Andy and Doris want to choose a restaurant for dinner, 
 *  and they both have a list of favorite restaurants represented by strings.
 *  You need to help them find out their common interest with the least list index sum.
 *  If there is a choice tie between answers, output all of them with no order 
 *  requirement. You could assume there always exists an answer. 
 */
public class MinimumIndexSumTwoLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr1[] = {"jrjhvnxwqvobhjd","ttpfrxmsrzieutzsdwtbgfauxo","kjrqcaeffuzbjh","ysaubzjz","jgwkwmkbuofvkdqpyjdrfafcx","rbozloptrpa","uooearonblulfzndlla","jjxnijjahijkvget","biwsliifaecdgweftexcjqzlldfsb","jnutkminsmnjgz","djge","gjham","nzurg","ekwrlodnvztlnmppqfu","xch","ejmfxwqpnxbmdpiufmguio","uzwuzehgylsojwgktqnscppjkgiy","rlnf","vrhppbefyxs","ljwxvqimtohihgjkdmpqpuqctrsj","wqj","ulorrrvg","oylbgfg","xipyr","enefqpswqwcomsu","kyqsmpqhmcvi","mquiuskrugn","gvfynijqqxszeeaan","mqbszlbzoopwlxne","iabhd","jzutovltkftaotjwc","tbirfmqnnvkfdk","hnvga","lvdqrhwsdollljjxq","othkpfckfnaldcepkijtedalrcg","gcht","yhhqthxajkvdhyfipcoc","gpvgdqxolqa","dzjach","zitkpolmnzhfsocredgtlhjzo","cevfxlwaxsgnssyszrnlnkkatkjig","tr","ulwrxgwngrmdkvyxgbijqoys","bxsnhqynnykpythlgxpx","vqucjixktht","yvwpuoxqhnmtmyosyxiiiuevj","ihsli","uxhmsdvvhqehroxmrrgjv","aww","dqcqg","kch","abmnvdzexihikmua","hedituiywi","fuomgvblgmqm","eatedzneghdhwlzprkqcnygboba","au","m","juyqyettrhfbfgjirhkfbusyofssag","uccsbhbshugpureqpdv","afznkrubcrcpgvqiyhcjsssfrknumk","de","juhfwmaqtmqlwxbmgzvrljkmnw","jjlbxruomlolskdlwocyukjeplesu","vrcbadfr","pvrudlew","hvccmwumvhqmhxnrqdoirqdfssrxjm","uzimrdpvx","sqekxfpcwrsov","guypqfxrzfsvcuujtox","qhoniolcpmebk","zsgt","cgwnqajp","skh","cflbincydwp","jshcmynzkjmtivzpyrhvakkczc","izlktksnhvzmpgu","mfsvckklutxywplfdbhrqlvsegbmtw","eyhyrnmbnc","ickifvler","mdera","olmmlob","natfahp","epxbdscyxubvbbuoeyac","mnzobfzcyhcsk","bdeovhytxmlqntjelqyrryywtpo","w","bjdbrpsyuvmuoexsjpxybf","qpvjaac","bcblopvcafflyybg","uzrbenlgezzsbicpgmbtecxkfw","jsxszdwpg","zvxifkfvzzxkzicfmq","jdwbxhzkqdfbrhhnu","bpxbprwhtxkioqfygivcfzpbexy","jkcauzxgteyykynngr","nfhvz","hcrowr","wzsjxt","ultflwodzigdxyxspoaqr","ypazzkyaffwxratmi","ioyvvaylxi","vvwvtqchpjnkulaukurlmuvnjfvwi","nqg","eywgtnvmulcxfjwfhjpknruxgb","qpxwjkyjjtgxenwbzwh","xbjwtm","qbzii","boul","qwakmqtnnwlxq","amfzjkjfkugaizypqw","sbzrztdefab","aaxdyhrqvsnzijxflbuvfrudmx","cimowwuokd","ngdtqvl","jgqgtrr","kksxzqpg","sknxwy","esoodtqjrq","ofmupjfmuoxogjdnfmzrtg","doategwfpsbbvuhufvcv","mzwrplvletymynmwcmyfmxlwc","xmqhwcpiycecuh","knkji","tjghfhrulzbshffjmhenbabcn","bjmxdszwjclkgazlhqc","rzyorislf","sngrfwpkimw","iuibnpmrwtmakzkkylwn","dhvhnlgfcwidyqphnpsmmldpm","jnsfzbbyhnhalxznm","fhlc","y","vxgjmfmpjzcdqinsmjarf","zgzyidgejzyroovvkbwzewybsh","muuwmpispozajuao","axwzk","zkedjieprvvpgoitsgbaipltd","mmhgfxcpjbhhlkrle","jfqobkbjrrzbaintfhfalmtb","akjqtik","cqmdy","lhgudsqlujtuns","yusfrcemduttyytmyphzhlhjf","ywyzurbml","fcqjxintdrxnurmhwmzwpglzseew","ntokeizdxolmhrbycvpixepap","jilda","anuwfynwkcoleab","fqbjexbbby","bqzlqbofop","rnxzeqhvkyqrftojndql","qjsixihvqgueqfughfmwmrdyvhrk","kenoerinujgqqlochd","dxzuvrspntbrjtkjfonijskqhake","fv","wwpttedupokwgqsbtcstvlipoxknm","sxgamictyvpzkzejkqfmory","oszhalwkftezlifgxcydxfdizet","apndhtaha","otujzfdxqhwgohm","thfjyveyrw","laqqekuxyehcjvhfgvos","jysjiklbnmqmqlgkppohh","trwpxwiukmfvqfuvgu","nrharueqmjdexmkrwygqqr","zydcadskqozjqtagcnseyjjmkfmuvb","fvacblqegrdghjfuehz","qhlbkc","gxghcfqdcmmb","ezxabd","jfnrzpyktvrjgysuhxedzoow","aczmbvzzocidtaruhqnea","qlwxcqtcsconbkhlfefaovgeeiz","lpqlu","fqva","jtmhyijcpdjlg","kfavdwhogwyaurxdzdgq","dxuggtcsmeey","fylwcz","ayosodkkaih","zyzsyp","mnopwisfizvgpwswoljqjajtacwv","epbwabudervxwkqqb","tff","xekjxvooqkdacwrpxdxamp","xjhtlmmsazvgjnxsxn","pfxdewgzsztylmxkigwopftfpudrb","mpfigiou","rlt","c","jlmi","rbiqmeehpbqjodlznasdi","ixhzmsxpbyfehmuxsmalwiaspzaq","cmsderlbbufxkkuiuzytipmd","paelznmsgfnljwabydcrqzegd","egf","zjijruezanbldqmkjcjxcjgj","hnosym","ctlaukuwycytpme","pppqdajgqs","rzmkqngh","mxqhuqysniwqasf","dmmmuqstenctho","ttyzczap","ynf","xgrjdecyb","qdmirfzgu","mfrziymyazeemyzknyexy","cikfxibareideypgidtyr","blijpqiyqxfphhrgkn","omwbjmntax","lauvaye","rbrhmyxexraubqiavyiluyjlyqg","xopr","uhoctnakqefoayhana","vjf","ofkr","ivrqmirhhfqdobcmr","cnerajddoaczs","emaguohbnqwoskitjgogq","bbfzuajpefsud","hrkdnnbglgvllphirgxyhtexahtig","avperipszneidsazgsajbflv","qzjwhzs","nxmftvwe","uwgieclbvrlqykfeelomk","eoivfztiryskakljp","xat","ohvpyxpbdali","lbhcltcuayf","l","maoueqdnisc","rtqtzr","nqwtwua","wadgecxsc","hagtnbkhtc","bm","xag","podmmvmgvsjeldefguau","jdrpzbdxtxjmlhxkfdlgbkxg","nswxlsmxfiyf","arkkqckwjhhxshx","xcbrsphbwgfnztxgwmpdkbq","itprhjljar","hr","jnajcwexxrrfjr","nqoy","occpvsdztkaaxed","ompbnndrz","hrvlcxhdivzsfczr","kdrifgbzedjkgebmkncaf","nusanfxojc","bqqocfqlfqb","setpahrutcb","ieaydeokkyeponfgektkrbzmqbu","j","deauhiggasqlakj","wdvdwsftvpjgnnzdwlyrifc","xnnnqkoiufokndojrltxlvdzyuvl","hysbvdbzpxkynlytbyzigpghl","ubdvmvxkthespbrroldtggfyvml","rj","xwpmhgdwxizhnpxdyarjylochhw","yhhkqgruijohfaynociglljxumef","kfvdpqjyvcaixq","unqskqnrchaafajetqxxunilzme","lvqlkolgazimzcv","cxuxktoyuqwnhojgdinrw","vvrjbsggievbxplshzdewtoltcvtx","iytnfspozcdgwyt","lknuwrqt","zrmdzwgxcolrcvddozcdh","chnsoevmloo","dokycywpkuqhzdstgleuremvcuexz","pnsqpbnaytgyvkxh","wxyfdqfl","qwtyzdakesfgiotrnbeobowyfzibtn","uuaewhnmjernwfsf","oc","hxdvid","xbicnrtvnce","mqcoicioncgpuphj","hfqdoymdgof","xtgkplhasmdlwndhqqgw","dseroqjonrjojobrpivree","jrae","erhetjqghvathvx","lbtcktnmyavkilxpac","atykpkrsdlxvcbgfuqbal","irscnpk","oaluehh","mi","cbpihwvopkdlapczbtkmskclin","jfunbvljcbesirmaix","ayzeqsqxncoilqxrpkzlt","bmnefyrim","jtjadyebiomtmrsketkehkpyi","xwd","lscgpplewzctg","hmgikeryjqjmvfvudfceygpg","nrfomidrgxomncnrbcx","kkdjwyv","hemptpmkjrulqvvaoxg","q","fmmeuksdk","ssalebebqvrsrpuzjgjclj","lfzo","h","vxtjicankhvtcqgwl","qv","wyneeyaetksebyvflmprrnvwz","yx","eozvxveptagbdcckjgtvuvzv","imuutzkygxxqcfnduhsxyw","nqotosc","bybqdzkszntppzdkkmac","zovpyrhyfebjekmguvzsh","rhauyepgnnlzgibia","zsiferfbaehd","nwdivuhdwhnqm","rapzuaoxggpjroywjrzzdhegmsuu","atcpesztjqxlveft","jrahqqvqwnpdbhzur","ibtkyrygsspwtscfrha","mhtltyvqmpesrpkbvqpm","tcdxusmgmybjrnhvluij","tzqnwsbrgf","ycndntznuvluvpwhpmozb","jpkmpuxex","zsknryqaypaa","finmvzwzkc","llokkpyiqqngosksr","kbczshsjaluqvhwdk","chvrwvhdtmofdydhndmsnjmdc","arphevwic","opagycfahxezlunnkefyezsxldo","kqnhpujghjxlalqaablehj","qmxxlrzzkyhqjsmzdvwfzdxax","vezlixtacfhvcw","a","e","yfhnb","zncxztn","yydxwkpdzdatzvmnsltboajt","s","vswhtzk","eeaynqeqekfit","dolxjztwdmwyfbrp","vzxzoevebsxdfivwxghfgljjwule","qnnooegsqlmlqojxxwlpnddvyp","vvxuxfakeeniebunnajvev","g","jaqkxpffvsm","pwnrjq","bxklnv","hsrvrlghpqkdezzasam","liwgzvqvixyd","ouaxrs","azeycmukhxhnwqflgucrhowoy","uuirtltjrwjfqfjzmoojyjpek","ebqoncauugxghddfwzi","wkmodfnyjhkgobufiyqejsgeo","xcxcb","ujyizdkgsbo","opagiiapcetkjstfckkb","kpfqmyvbblghzdbgaobzrgjtdsvbvw","kamvwscebbnkcaypyaxvznd","lmwvjejmjjztmavxrdswexevjc","ishotlisbjnhfzmxcevg","rbkhofbclqbnsmcxrb","sry","jcwproekfjlt","rihfjtrhrzbjatfutnmtdnseuwxx","avbqqpipzsotkxdfilvpvsnrf","zvgasphejudfdsjnfbezbxisowxwdp","wqcolfthivts","xktf","ps","nt","jktke","fwjjnlfzyapyff","ckjheccjuqrwn","ficjmjp","zwkmklikeaehgmv","ssahgwphuvkreldocp","rpkxnvuk","cesckijjxverlfmhhfxwu","hvadmyqzefphsnzmil","mmjntmpxcvvsfjhseygaddxncyq","gr","xinmkv","dxagke","r","bhzklwxspulubumtrb","wbbopxfpdxcnrcjqahhvwa","ojwjhnqmovkde","unzrpf","xtrt","vokwqgypnisrulhmvttktmnldwzq","hcvqegeomqawkughoax","usswyvndfbuiscbygqfu","gwcdgb","uwutaevveojqvhzsafbq","iqiqnscrciuzevbzvjzuqj","anxecporjgwxctifdazrxgdphvpk","i","slsysgjyhmhxfkfhrmhzkcvsql","spuduubpyvrixjyuivzuqhqzozd","dlgtkhcnvk","d","bbmilfgioewufofu","rxkrlxnycqgluhquus","obbiptlipwmetgredth","vdmvjayjdzbewfvmmsuj","gyxbgvkforhzjxtcviubhglcdt","ojmrssoud","lpxbrzclrcuhnnizjknpfmwgbcr","zdfwbtbouufeojhptcajozbvd","tffneuiyiyyerlqd","ttphpzgbmhgva","uiwrjgazxehxzqkobk","nhzgep","qqdzkxie","invslfwmxukpontpnvyas","wbaed","iztowiz","ntujpgztvrbgsgzwpcas","ixuizmiesyclhgbhsxawmg","ynebykyvxishafvvaxz","fxlnftkziemweocqbrxprya","sakhddhcqigybeylfcmcttzvmo","nnrhcceqnsmtpcsvk","gdchodebgtemvxctisfopav","ihramzgnlcnmjrhhd","ydzv","oochnjmwikgllqqynzst","oljpcbsnuodagqwwkpcsx","wapdscbpq","mx","orjzegqu","kaejbfagpfpibmqisevzqehxxksgio","xgawcibdyjeukklxifcxzedckry","gkqscbasfoicqjq","lxeanbopqapmtmmogytzeomf","npdjyhivvxcxtld","qfkpdu","alcyjixsvii","aukgnejrqmtfxvypjyuptduawkehi","ghicwdncxomvnkvoioj","yaarereqwslgzdzbcsafnh","pyxkjdmlywcrfzuvynkhxfxjldrnme","jlboogekdmyzxgtxpe","pzfuesrgiwqvqteb","lzngdoeymwiz","msa","cegleyfs","vyqwzwsmrxuqcwcchgvel","jowmfpwu","xiqribbhibju","jabbqzbya","frfapcs","twalymvhfzmfsempmok","tlvdmyqkegxhvtpzvgcsoueupi","uxdbvkureylzvatv","ronxmi","iamzozkvgujuarnztqueuk","ufdtxa","smzhsgzomcakthgsyziaasnxkuxv","kigkejqesggbnw","puihivhmxvzktgpkodrsexz","fddjlztxbiltymeplejjaivil","yzbsoniqgcubyecgdibautar","zuprzdqcjkpuzzilcaufeq","jy","qsgbqjsjatfpkljre","tugkbcmquag","wplpgmaxdeuvgrunncun","flcqthiurrgmudbn","zzrrvstb","rajnyplclbzc","rcaroojyxpcwu","ozgwyemfuywuzuhvszgnlqhvdx","mmrzsdofjsxngokf","pfkcyxqgigebeytg","ebpanhvbt","dqoxzfoqjnwaghyxmvtrlx","blqhhuhcbmfx","etfaefthhj","qqlhvgfpmetdsbvy","otngyffwojwusskzlzalwtj","raxwjc","eoalfhvitprobsgwv","phgxyzqumxzcap","sf","jfiyhjgfugvtcq","ujmdizejuutpplvaydwfm","pmbgytgtw","fujldawjrxdftxqznvjxfikflzpvh","axtsmaihbm","dwdmivj","vjgqlihbpuvm","xhlsuqbayjkonz","qwlqnyxlhypnjpnlnxedvuxkamluk","sikkineqwubmnbaqqpzoqxb","jdkzfxlmgbbhbiloqcncpoi","ykskhwjplnxqcomeifoij","bpn","njgkxmyqtvwcxafh","orzbbdr","ayi","wwjkwwhuaohofbgnzy","jsjkobcbmdup","ybiyluqkysftucrwc","imecfbtsjqckzx","ufd","fftgejconakvxzzfyzlmlzcgyq","upcosfgylvhjfshnp","qwmiqdsgvaqhgcydgyqvybyc","zbgqcbajmxlhgqeborfibjpquqfu","ejmzlnkgdgmslujk","pdzis","ollhrml","wqxjyylfizaaecxenkeymmstlg","zptpxmyfwl","mcpdymhfnqvyfgeigccqbx","byzedmwnkapezshcvxihrdvsik","agrnbebhkpqrcdzrabhftaztefpe","xbfuju","ccscpapw","mcibaqjkuxn","lynuwxuoyqnjafggqlblhccj","sbtrdcwvgwjetbaoimt","kijvbhovmoemcqe","hhtnyiyvnegmbmsnm","eebucirzoijcmffgohimfuaun","dvazbusljkgpczrudd","nxdm","lyfzjefanlqcpdqsvffbeliz","tsk","eryaqbagdhdffdak","nehgkpfnrtcpsnvxg","fquuivoedybunzoy","tcksmahprmctlmkouorratusebgz","glvuivnjwqztkemryjny","zmwwkmtghewm","lkbcwcnwjfpkjezluoiyphwuwyy","oenzixzpmtlpejpp","wx","gvkrvdgjscugcd","hplkx","xdcrnkrwgddlgh","jzoebrixnrxdioxeyfbjoe","zgwsltlcbodundbirpzdxevcpeuhe","pyzpofnypvbtqrctjmwblwbgpab","iuqfapvbhdrvuzltn","pdogtbrpsvysleovhmrdtti","axavsefn","gubjfxsuilirhysooonblmumkukh","szpxccrsriizwciszyzgorrwnqj","fhurjssekrlnxiduur","kpggpvmnofqlxqrficgkbqijiyqzcy","ibznnutcdomupyxiluxtbbr","esr","wpwgphabq","oftbtzwdmjowzl","bwrewha","zhfpjtstjhvroegd","fcwufjsiymkzgzfolsygnevg","pvyjgcixaafvcvcvsz","gxk","igytdyucqiszwzf","ugysswrdkwcveubjaeripuc","qncqaxxwaixqhsuhuenwizwlkfecvn","wylimihrvnzrijovygvogfklszq","mugfwwiwrvbjhmljpqpbpsiyu","fiqcmewuifsd","dgzrhxnjyvevbtrfjmmyanjpve","milojegdhlreaot","hkorjezecjpmvqctcjpjf","waapbahymnrfr","owyqwoijnlfwpzxkeedwktfl","szkrhhudumy","qgjpdnusafugbu","hyfzyymvqddpjabunvosgs","ohnbxdqyvqohbs","yuuzfdaluvxczipnfhbhkuldvyrnwv","ggigdrfgoibeppb","pcsydyphuzjswhovmyxfdscik","fcohdjpjgyvuln","efznwtzrzknuvstog","nsueyanoyfmjrnxqu","aiswssbxulzjhvg","iaivxvuysdclrkcstogzjcuoqdnif","hofpzlwcnarvowv","aehvefxagkxohzsg","uicjfzmci","mzevhilyddihkalwlzvndvhbnpkop","ecqywwanicqvfituenfvjslmyo","tjrrublijijhyzokjixcol","kzqpykntqxyvwksf","favlhyawpwhcvnyuzpfzjedsncvbp","nutwydedwerdxm","wwroxhrfiige","shxjizabmpwqjlwxjkwpddxm","mnyyaxfbtqujflsper","xmwsadxwih","suhivzahtprbdfffkahxxiziw","paqtiobamiqwliuubxdg","ewphtuobmfwcuw","bahotkdralteqnyogjy","pzojdwhqpxjxdt","cciadaacucrxixbzzgwdgnjwowa","cxbkfbgqhvoqw","ggicfqqmpwszrzrajktnbd","vojnqukddpudjpzrqqmnkcdqlj","tgscckicwdpoonenfpvkbza","dfuheuiksqgecptw","xtjkywuvtdqvvfqrfsncuw","xfcacfuboriw","cllrqtgqnv","dvtvjglricwtvqqtaqgvzyey","yihzwijjopeboitbavgozsi","qsjristvkuxhfuxvr","nqhntyowntefzngyfdt","wbumdtgplnqrcqpolw","nmmjjtsnjro","epseonoamwggurnafeoqzfkr","cwnmagejhxkchcegbfpgus","tbgluthursgpkkdlvxaq","wspktfagcrbnqjzzmsbhfb","qclocbxtonrmzodjhcmxtvese","zpjdpknmrdxyqasf","fawhkzixowdtkgferehwmypfyjdyq","qaibythdkmmtjxycefhycabdtb","mstzwgzfzvb","uwiyvbjqyifcgffke","ibnlieuwnidxdzuupif","lwizgcqrduej","yigswwvtzfdvbwdxgvozrotwrvwxxi","ofcndbrybziorodtaulfoyjy","tiptnidreaxclvf","tzwlcumkhtsxtzh","rnkyebvjhmkplnkjgs","zfyjgsifzhgigogcyjaugr","hwxgwsvooqsbakqkxzjmymktboym","wjrzuhqmzoyunwizyub","xhxjfynmmpebbkdcpzlxd","hmrzinnpwy","eowsxgyyofjdmnhhgcnzoigrqafqgn","afmtwhhvdkqytzmxsidzmqubfqvyyj","tllhuyefwtojhyuibaixhexcybvw","wscfjvrfrvrv","vkcxgtxjwm","gkzudqmsvyottiwsg","tfikutntimcxfx","zmjzzwgpzlcfxmcbqvaoyffakya","vcxdnttuzemi","wcoiexamjrazglooz","jonmnigpygucpij","pbxohpornwpcblciklwdrcmu","xqdkbqeqnmnmbxerux","itsmgtabzp","faqqrmohaduowqkyprccfir","hkizafeuvjabrygab","whozxobdhnworutrlcoiffwszg","qdriglsutp","airzyxotvzmlvfagi","kliwpoodiokpkrbhiy","iahwbwchhzlheqprjjueb","vfwrywkcfrbmrrhxwvuvicbwpf","ncogkvatdtmmhqzqejgbzrk","drwaorqjvgrk","ezkksbeyvfcfkikkchnsqglcag","dfuwytwjahnqhprroerbgsnfp","uoajgxpyzlaihys","ekaandsczsytvrarvjjqmk","mxhlyqklkvtnvrtflavec","ictgheysrkivzohqkhdeg","aeztlrcapmrkytqlvuxmwmvbxtucbh","koyxeahoblorpngo","phbafmfeidxzaxab","ivrtymvxkvaonrgnmvdwa","dptohjhrkbveuczayrahivfszwhp","asllka","lzjkk","ceykituczcwefsr","biqjumgodmtgtnguemq","zdbgvclgzj","cmbvgrptnmzrmiysebpjcpdqbxz","adzbbopjjrlgylanwjtjvd","kplhwlleknvo","ldrngmhakvylmxxrfowhth","cvzifxctlkvnqspdjddqleczfa","wcbocbtozj","qlydusnctuot","dfoleizrxidahmiodfzosdu","dvxuzkibncubmjphscvkowtdqrjcq","snbazupyvsp","cyyojoqzfzfzxsgpwqm","wnrbvkwevhhlmbpvi","bjeldhnisqbdxtbfqqdzyl","kgmfjqkobsvzqstjsphohqkzq","yoqleeamjloiavtekgulot","yjhmansypslkjt","xulmgbujdrxoaojnffkjkd","xgdxmhuqkdmyskz","bdmnexqguihqngopgodegqrckr","xruadtaysznwydbizugorbsnrfffko","noubnlubybytcmmwckbtrdnunjii","niniygsnzw","vuvtdzknxf","vaqbbvxhokfkqwsdrkkvdu","ljxwdiryakvhrilaqys","qwmtaadtsyjbsurfwxx","ifcqrllroao","rrxggkxgfbnjwd","uxpfemrdisght","xneepfxxpgkyzinabhkrhljszlykaj","zvwlegcdjzhakieueypkvxdcow","iqgdfhrabtqrbufkrdmviiz","dwrgbsukttrpxhalemrbldj","qlmtadnrpykkqi","jbjhubpbejpyfuppinvahgvyrebfp","yyjgongiwtpr","mchpbnjlivivgkgfpetqeakq","ckvpsmhzuphpxymano","hcwbyznfimdofercpxysebfnai","fxzajmuxhw","bqbbglmqmklpygxpaieaxkagv","cmsbiyqgqfrknvawwq","bpjosfnbxlphvkxncefahqyh","sfgszuenggcttagvtl","narscxvprvabmtsffzmhtteou","hvbykobdaeepf","merrjjpusypwgrx","wavatdqffsbnolefraerpj","eypqvkitdkck","vzrkwyvvtadlukhwuveeilfhu","nqgxhpfvgyzjfweyuqdjfhugw","abhoupmdnpuqskuroeyelxrerpqvw","nbdtfbphsutsldoyipycnextjzwd","vxbhwvjhvcpidqtpvndmkece","djlwcendbtumnvrcjapgwmaxt","wynmbcfybfxxyzg","qlyjecialabklnegbqzm","wtxeunjceayboesuvuhsnrpa","rkqifnchhfgkpnzkm","fmutzcxzfosldkvrvdaxsemror","cuzpsuthidv","pctdcftovlle","negzrxxcmlfkizyxbakzriiklvyavj","qjclrictlmookiikruszspbrpbttk","fvkzewdvppuerqxssbgqlmqeem","azhliztyvuyfrlleovssx","hamgfqubgmtdglqrdiujufndawfrt","veukrsarxkrcowsn","jsyyxcabwchgplqg","jiskqfkrcrbgxbhcqrwqw","vseyndthxcuomvnfxsyxjkdjikm","hdpezxvkgoxwhvbky","fktsiwediublvpbjrzekckq","ksjmwwpjzwuffvga","ddvugbpqvtfgclyyswrps","urmxwhoalpxxr","vkepspvepzwsnddrqewrx","uyvlkhwn","fvjpqysbhmobtzkcnntn","wpzvj","oomoewwish","uxepfyfpvpoywtbojxafpobn","himahrfmlzw","ylvhwzkdqxvy","todpcgjbhhugxcqbkkbkhrlxe","hcbtndyxgufdlsjbfcj","pxxxnkhkzlcgsrxhfkcz","pajqaqkctwiskygm","dsrvfracgkaztqmiudy","qsmwgvyujuzvvxhoiqvzukfso","dbynsfjcpg","xahmkkfcjypgatrizan","oxxrctuoaurnykqkfwhjyikr","jhzpkmnbjcevtbcozzhwlfwfiqf","wrgkejiasojqrbenvflget","ufnizggmblxhuqwolhfqhmqu","wavwyhzxposjerktnhhxde","v","macycpoxcbgtkbxovnsf","pddqmmrvhzeqtmpmnmhnsfdghn","dmwrdjfazseypzsyrtnxnaodtqigd","wvoqyoldcstnjhpvjngdohwdrjsb","ivtzgzesqphmxzzmp","styierbjwgdeckkutejlidrajfdvqf","kukpzdiudhr","inmjldtzrhmwkoorbnccwh","ydcrwwzvkvdasdschjtodau","gheabkvztrhoymduochtdcmb","rmggqqitcqwklphrmznkksdo","lrppqxozcyokddbliyfoos","dutsobnyoljgnqrg","ugqivwxoxehqrstubnifpkaxg","uisuenrfzszujoepotgvdghotglvhz","scngigstupotsmze","rjplawmoeslyitypetr","arudujypwbgijvirlithv","yegomgrpkssnudfxmnwksk","bbaowbwosthjalsvgozvr","zeeswpbrczamijljr","eeioqqjrennu","xtatznbrhkhpexqcuxvtjkl","wcekafgkfpjjfagbtxxewj","afzaczmlolhupepfaq","wc","hluezbberpnpdamlz","imywrljnrwbmwgmenuztvezuyxuwm","prnuztsuzkjfkwcacjazsqqaga","plvrwooftthwwpynritoouthcsbi","zaagbdlmchcdasnnpmreimtxncwb","ojpucddyouwnned","lxdtwiwdxiilrhd","zcohnjxyqboevvjdocxxupzmw","mxcvmqqzszvp","tydbuotoebfmfv","edxudrnuachv","jwvivodzfdcnevzlgwh","acwgmzjzejajutjsdbqtbv","bwxkvohdlbbswaoiunbj","bartmccseewglptpeqgk","wergsyfbkshpslzjyffit","pnydadyoomzur","hkugstmncbhsxdhm","scwtuhirxqsavmntlrfgaols","nzhscbtguqnoyext","hexmvtlgxtvdsxbcbodusbeiic","tzinhuvodjhydeqmuyac","jzrzxfcypculqwzkzmgbme","eghnbftrcktbtnpu","ruoyzxuhhmrccvhcdsx","yypqsyrexkzj","qfnyenrfaaikqkppnigzinhdy","nnairkcenziwapvrfsjqgmywi","ywovsuwhhbosdwpnjkwnhisi","jloskwqxgqtigdnrifldf","bmmnugugebbyosuvep","zpvmy","ccryqhuexl","whahaabngiaoysboxq","gunajyiyvimidhmtxfll","oklihfhoby","thmolyvbihyxyou","utxlseqkbia","wwnsggkbgus","ndqexgsyte","fovn","ncgtpvmswrvjwvmtk","gqjl","kknutguiglojtjfzuryofmjjjfwzgr","hygjdcmi","ptxmsskwgzbedcpx","srczcytqytmxvisqtqcvyuro","pbwdxhbnybl","kvlnmvsjyuutwyspvxycdgyxzw","luzsxjnbrctezizmwngrkisz","kjpzphmmudjjlnpknhmkear","lpzrdpguvczjpzvqkmgook","hjidytsrxpfblhjaha","vmsnsrpojfogttcuvts","eolbjpugwomqbbdgapkzhks","ddkcbsheniinzg","nmg","enmpwaciylshgndbpw","mioortjtwtzin","kvslaqkkmitq","ublhmfsqanvuxgmavdgjklfksxptc","uhrzpowengyax","mlmdspfbsqamwpphmijrsgsh","nuefwhkyurvcjbvwhmvkrlblyf","oezyfxgnhffimixapb","smwrlvbidmhdnneuydbkkawmqugn","jvxevqgoxskqrwdnjnhmtspsvo","oxzxcikevifzza","mrzhqwjubprihnhyyltipimv","qwuvbseogegyezrgxscsorrot","aiowyivui","ntftnt","queextinmqhuutaqclqtjvxr","uozusmwqelao","dyqahpcftwmfercccfpctisplm","dfmxvsjklaebldkcpxdswn","ghrrxqlfiqtcxiazl","ydymeuqycbdqarsfe","hetampokzgyxjk","kkpwyoclmmatmneqehds","rzcxmpvtteuzzmelimb","mivjzutpmdfazzmsgcckihjqwgw","dezlxovpzshtvhjue","aahmjnoixelmlxmvoqcyibnofcuvdf","ieeabqvyhfujknvihlkilhku"};
		String arr2[] = {"rrrxhwzrcwnhziqacxnaqkclhc","skffqmoeigtmbhjorowpg","watjbcislbqxtsdjjynesmjcr","qhekkllakoxowhxtkumdlqah","tanojzphedpveartpatuviytdz","wptswdlxgevpwvxcvgca","ebozyzltyyvso","ytgqrbrcfmtssxwuoge","cwhprmnslqrg","dcrvukliimirqlatbcnycamk","bcykllcdnxq","gcgfnvpygejxeufwzakqk","tuuyyqbvnzgpndzlgofpgn","liqhky","vpzujnnbg","tqbyy","fuwy","ehetcpieebtwpfhwwquxgym","rbwmxxkkackgwdphacwjxgklpg","wuh","bltuzvqovcpqkvkdpjdxlqjngvitt","itazdaycmdhmgcwdvbujc","mlldlzrhnkvn","fxnntxuvtzjrxj","hoycvarfxorryglxwqpoqacydxf","tsxdkbwkeemefphxt","fgbdskgwwlqsachtdxulyeu","ikfrenvyncezi","ufqbqkvftzxpdimbosnevpvioegyxo","fhttwbxhyhsvlcgttqwsqsyk","zqwjmh","mmdmugyenivvvjnxdroom","yhsjgwmjllsrudfukbnxsdl","osnqbnjthsrj","brfiank","wiucubzrmyrxzlawxmjancojode","njbwvgtdglqxsqqaqtbprdnljiu","qarmu","yzifrlsosgbmislwajscskev","rhblxmyvcvqtfjxvxcwfgenz","vhrilo","cqcvqmjjg","zdvsg","kvswexebaauwh","fqeoxaios","uyfzpdscueavwiscedkxw","obsaevyejmtqmlkmkl","kdidyuaxaucosmrswknh","niy","xcdbmnxjhvjtnpwdm","uzrevywuq","luwhgcep","yalxzwhtggtbuaqbwuuaetgnrait","xshwgxnirpqj","ntwfjeeswehcivvuidzqy","navfmxvtqjkjzhsaapdwtisc","cazxdzxoyrdysmy","nrwhervird","tddxvl","ueotplwn","acbwxkk","xyciagxozjwlpfgy","aktuxhgmm","haicnxjqxcmnoslpmrmonoeestz","bmxhyvhdujiccsfkkzbnn","mskyhldvglmzded","yyddi","qmtjolovfw","ihqfcxudusgz","ljdcb","wmkulptxrf","oxntdg","wupdcmvhfdvuyhqjgwhgs","ooulhgmtwlcdjspwjhbgcjjj","moszzezpisgryrzgc","pzjzmspa","cszxtfhbdqsgqlgpykbtknzcjkks","bgltkuiarbhdb","nhozjevsuvlqqnehgzevo","fjxem","cndaozvfekxnnubftc","lnisecfutfgnzqycvugq","ttxjranrrjxcz","hzafnftftzpmukngugnteajmyu","zfs","djm","yvpxvpxkpbsohuwdyadl","hnvimppu","tacjlxsjatbivoqwcevuith","rslmwclfvb","bdabrjqizqnqyikoezvvism","lbwpmxlu","pxbsbjrqgkrfcyqrvurdimoik","mdhpmjpdygxooibkz","ybxqedvccxuecmkkrpepydfydnxc","qkclsskytakdevfpygitwwegcigagb","ppgddkpyl","jpnnvtsgqqzaf","pslrbmbzwfoutyjmehuhmgqmytpj","snfpvacxpenjkctbs","fwufpltgqwsrchetfknwbxvm","fikwhfjoswmowtmxbtv","hmzvwqjuemt","ffltzsnozsvyeukhdqlhxzpaab","mxzcdbimgjpfd","jkkkzfnjsialiyklnksikq","pmpytolckrgwabxluy","trwlohnouze","joaobcrjovryhoufwisu","buwimoyqugaakxqkjqwibpoiht","anltkrafhejphtqiqw","sitwuyog","cylnzu","wkgnxwtsninkho","izrqgltfzyqhvglzbfz","phqgixaccoibqc","znh","iqhoocadkydrgegopbnu","ftp","lwnjmonjqnkmxzw","uqevedymqvtfqrnmsprjbdgkgccu","otbxfh","wydgxjyvsrodwxwfh","hfragmddmouytht","zkwqmtnplgauouozsgyebkpmjteci","yxoyhcptzggrzmyu","sfmsrghezfuoz","jyollfcvsmtgpozeufvpdbxc","xctmropxkwiuytfgqsvwjajkd","pocivhvvujb","qnwosildwmcevrqonmiddlqsehe","avzxjlema","nbtmgzzgx","hjgiqnvgvqomvylmmcsx","cxzccxomgrsynektvuslsyqbqudy","qmvkhndpglcaqproxgaierrcou","fkts","mkcecti","guqwagshmdfmi","otisali","pzpjofsto","byplzduhwdkxk","eh","bhfhppfvwwbabqpnwhpfmhsgfttmvo","awhdnlvbgtfmtyjmjhqanattabq","bjxlyyem","fdtyuii","tohpppvyhrnfsgenzkcyuhrchipu","xlnawcf","mpwcchzmwltjzwlzugvp","jaqhvrrcmkbjkniwb","hpbfnc","alnovitn","eschfntmiyzizha","fpfldwykwzijsalrhieziyuehyvrpe","kjasvtqectf","luyklsfviumoeeqru","fpivruscece","sqiksa","ikt","trdsm","ptxcckitsmvuijydvpoynzsrzp","zavb","vzwernunydzbo","abqcpszzuqlnkpppkhoorp","oipwtanacy","comwoy","dpfydlddkbnatclczppyw","paa","wdrdq","nrgdiqgxlrso","hlkqnsbtuelpryvusfvyygcwmud","rmxptpepkjicbywuymnvxs","hz","ewxhoyzwzqxjshtaoryy","cxlnbdvc","atpfcgrhfpxeihkqncibo","mz","hhyibvkdyuagxwyuimxztyr","dnzemkmqcvzskjouumzgqvilea","cdanixtwtflxk","sgvx","vtbxvswgdienmqnf","re","moqgrxislwlanrjizovxvzwapbxuz","oyfhhv","yvpqfu","zfldwkstrgorpc","attyxyextwzlj","eemnjvrjdxoanjb","ghdln","rdpmtypffhfowhqeyubqwbpuvziovw","xzbyqtkmc","ifgrocvnyfsrnkyhowwfhkbzb","cqltzevqadchidajxctf","acidqfbbb","rzpapb","oeqywylzmlnlmhscofrl","rtdonwwyqvlgflykuwxlwdnw","ltdjahxwczkdodphlgufrkw","ppsnbsbvsrrwctluajnxgdwslc","hjwbpbfindwvqnbehqtwkxiabk","dgsbvybw","czjhdmistyuy","zejg","kfjylqvusojuolroiracdt","bysgsemvopnorpotcjlhqcnh","ggsvazmeg","oinppuzvjyormujxzvfvrppbjyn","spwthjrsjh","pgwewdntziklmwrpjumvahunhqc","yhhrnzijqelnx","qhedtojghefacw","dykpmowtpwsqalp","ahknmkpnzuxbrnvck","ft","buxnmcgznlhpvbuh","lej","djzibdgbfpwnbjinc","qatyhdqnyninixvrpraw","tyzsuebbckskhctvfj","fjwnvzgn","eifmowxolektexeihpjbcpbqqaznd","jauhsgomoozvlgablktplhxjawi","jnkopotquicybhdxqbkkgfisjrlv","ymzxaebzcdsa","mewcps","btehbwlcfmarlpl","tdkbctmnjhtdmnmlskfaay","fzntnnabzmlugvemfkwwus","gl","jcjxetg","mglvkesccwaaaqa","iwlzpeb","obratnpixhujeuabzfivuwsfp","qcxsyzotyhxc","ccyvr","nnxrem","kpjhhpxflwxzc","wdctqqxciwxyumrshhyczvmb","tcpoqcgwzi","engezwexncztzdy","hsvbveukevuv","bpobal","ujveggtyxojmnwddaqihrc","sloc","vunlgcfqtbiakyqgu","bxanhd","gbp","mujkunzypmbtzvqtqi","agvjgnu","zxkb","lrfdxgrunsokyeocxmexy","maiovvnf","efc","xlmloganmowvpqxppdyecfz","rjogfjcynnpxbarecesy","bjuupvcblwldttnzqyeap","mznaafxyrqsyhckbmzqdkxgfcsiui","osdqjaszmpucuhwjxzeszve","tilijej","lelrgutogwzsmpyvt","joah","robmunpotcbyhvlnjltmiythdx","wgcqurlsqgxgjgauceqetmyvq","fslzqncuhzjzlieasqhkpznrmkh","leeqgvpr","mqzbuhimuyipob","effrkkwjwjsvnja","ularwtwgzi","et","tibttiomxmyhmevjeqorf","pqdyjogdimhnyolejh","yyiqlst","zfjjhgoozynwddzgd","cundckoxfuiissmvgv","nhqbmxuzlhzxevp","dfpvgbioagcdhl","bbsckfoyuxcik","zcohk","aayccgqbrrkzzno","xj","rnryhziim","lisrnfqctwukuzmbfpe","gauljxfsqvdzsvzfhqluki","obcmrfmkzqbpjuca","jwzjtvphjweodtd","csshbiyg","ciatyjinyf","js","gghuyafezh","tzpvetdkclid","tqunekuplwwy","btiuocmuqzdoladrgrdlbvtijcc","ikjxsopkhi","gkevp","nojdmsywgcfbmbmxlhabtn","aiefgqlvnzbbfhkgc","bmklzebhaptrtzcyqivib","acanttziyjgt","twbbtzciecbosenkznq","bjrgimsnboid","gvvgfdwutddlzpxqxyb","ematxbt","towbgcgifbghk","ai","srtinnnj","rfvrfqqwkagcqlxw","dukswrlfgivs","zlzfd","fgbfdmedyhwinnxavj","hyvesjkjpdkkajkrllluvjxhlcthre","fjszcibacvsgqzotk","qcl","xfwcevyb","oirboekzuuvtsvyzu","inhw","pbisbsixvwtkkpezvvfjmt","jtocuvruheizqlqcreqxpiwhos","anuhnabctcwrkvzvpulgtincotylyl","lsohytpejaimvsiprkqfkleiqcab","rgjgd","szcczbsifbgmacod","geityprpldadzxagfztxugyt","wujzracvjodlbqjixgdvtn","nbfzc","zragwzhjzifnbkedeozcebog","njhpeuvlrjumqtmyyelgcn","alexsueunfvje","gvkgyfbnwudcwycvteldrpqbgfy","prqvasxrbqhvtqz","getrxzmibztvhkyuzu","twvkcwudduygmpn","wusemjcpdukgsukrjyjkrzmav","jwhyiusynqrenrovwusq","fnkrvrupzwyoxcuwbzikpu","qsjklyitwblcfgzgqsvnrgjnggcnj","cvbhllazgbjtpohjdphwosbxoa","ojfapodmydasvbcqgflyqkfyf","gqmcesf","dejgrhhxmuqovia","uuuqzmuuhigeaxaehzucyklaie","bbhfakz","dhmvgvcgxtebvqycqohigzxf","ogqvicbxivriianpuynibr","qfqdefy","nqufpk","tzajmzaxscoznfacfrsghjoo","lnkcm","hgddfgznsxwjtknnkretfk","ektnovvllrplhcdv","nyy","ssbuyhs","gfbvtodymeoiryd","gp","nklnxhgwmzbre","iccpsbkfqnfvf","eagdapwmzekqcbb","krcwgmauqaw","abdubaxtggksbexddxxibumvpzrc","zalwvyrbwgribltumlutyezhw","nahddoalniufsxspcfxoddqodyr","ygshgjhdsogstydmlilbngluy","oiztstrosyqothhjuxjiwgxgr","fwwzmbiur","ivrlwkkltdl","axtmxzsocspfucresiphy","acazbc","zbpqnjyoxibw","zftrpiaqtfusmwzpqrn","hseowfcavbsbapkdocaeymoxwuhs","lnfdrgnvagltspqc","evllcekpzmolubxshwjlwzlzy","tlfwrhijdprxdzuijssbvsls","rpepsjsj","aefr","fzgaavuguepdysu","popmol","o","zaoefoesimbiyomtm","nwraleertxqwiwxak","ywnbmnmwdijfmugnxcguhjt","zpsbpfdcswg","bdnirbtrjjlrprghbtlmi","gmjbktudjbgvgvlhgdmbzudapgt","umjtm","smahtvpkoxeuzehwjgmckvb","irdxteemcoelyskbemu","rbdfmxoapxvmaid","tylvezsnesl","mdoofslsbopwi","oudfakkpkwycbytcvpmskga","oedunywspgdbtnqjakwojimjc","scopyiue","odeiryhhatmcfaicw","mcvlsuqdtzlmwstajnk","fx","bismqskpjonuhqxfyitwlbwdap","zipbyakdrdgidmlzt","t","sqopq","mtmbjcvi","oxbfptcebfxcehridwsjhwjnwj","krusjjigvxpdy","lyhootomydeipgywazoawxofz","lgebrgddtxc","lidjphqpomnvsefpdwn","oenbiqokurwc","vihdupc","suajgsrminfvrdotmmxejqzs","kzxipcengqcbnuixqstp","rewqcmylopymfpztwolloqycc","jblwoaf","nfcbk","hlzygsgabcuzvkdveysjpsfg","zxlzvzupzamngpdg","dyqlwdbhgncsbuxpesicqw","swrnfa","cyyslgeqhcpujmfswu","yiwivvtlvzmh","qqjvouyftqkggc","ohfztusrggkpoahmgatdgjxqcxoe","zdmkztmlyutfbqgbnsoarddqahe","uipyejgckcviab","qduvrtghwzuim","vkownuxmirjgljrw","otjofmiummdjzblzslturq","lxuvabldw","bwsyqaulpw","ittsarkshuafscbirkbid","zzcq","wsost","eqfljtuotdyh","qdayponbpifpgulgbli","gsxjncmxgdqzehflygtslasetwm","urdmnvkimzntqsnmjiwgtgeicau","tyzdqhzfwohlazgvarhr","aclghlkrzmsbqbsbnmfihtszghkx","hf","grfwxdc","lhcrpgwjlzkqkgy","omjqawlpvt","zwdkgncpg","rlymgggwavpslirxmyoismjzajaxc","nderlobfszdong","mstaiiuet","uqwllrggva","lxcsntfkzreabjrotjghfzjfpjz","qb","u","jbblqcoa","nqphwevognvxiuwvhbuxphucf","leeqoljqgudquzxmrk","nhylpdiaqhrnkylrvzouocrijamrd","vhxx","ifd","jhjrththmnbdgzsza","mfegcsqmd","ovfnhjpdxkms","ozoklckmxagudwe","nslketqjgcuekmsrfr","lzggsvcdvahhwjtdhh","mktnfhbhgt","socuzywlzezkorfd","obksdbxduyxpaphiwyz","xyasvskedjxkcjpfpabnmzlkldpk","nepmymqopimyj","ybtz","reehghbygla","cxxvzdoetocvdms","kdlpxbafdysfrpokmhwvtaxsp","qtxpvdioa","zfpwvkwxoansmmz","vvdtvtyxyputrfa","fzvxnbjprgjcmfdbbfr","jdluqxdbdupfkedrsclip","dgaanzvotocaqdllr","izimknvxcwrlgtojnayasnfqsk","oagfnbuydcxxyrjie","lhdnamrmgnypdscemsbzfbugq","yoezy","plpayttcvmmpqcfkcngkybup","cxqqtsesaugjwlawfuefbedrwvzju","fagjltqqcbhthaclahzbq","baohtdrreojjaxdywdvu","xlhjdsdrwgncojybr","nuztzdhsxjjjojbwjjnzeflabuw","dfab","atpqaiolfx","ozpxjsasnytbffvlbuudkax","gjfdzejxofy","iaeaapkolzoqjpbkwyldbdaakymme","dtoen","kdvskhtwjyamrgiqifnieqbseiby","ivlfbaj","mwvnvsgranavbt","topwtmho","vscqwvvujlohclv","kxwzvjfcrksnqleijqw","ejcgtvbrhepffk","mskrpbvadxleshahiudygkmsz","uqejtagtveaywgvtfrofo","gfauc","ttedhkky","dyecwmxyjfzssnuumeysat","fdkirajuabvgodpfm","wvjijiqnytpw","oyhtezf","xqiuclgqbwnomozqum","pmjwstxhqtcekb","xezjywehx","ci","lxypvowvas","upkltpuq","bzokvocodyypbamimsbswtkvgo","oauucbvlxwb","mndcgby","vrkqphqyqgn","gmthflroraqsuz","oiqebygaeiumulkmlcdhdfkeykci","hgftsbqnqbldqqncgoz","bjlmnjp","cmgnlrbmqvnl","luhtchzbezq","lhhreehopftmxjgisajs","ltgrqyaxyfjubtrrhgovw","gfubfcobevtvuyftoeq","bevglczyfkbevinkifoplg","sobrqdvgaxanecsnhnhxkzhwk","rpkeubjolug","ukczzwwdrtxdvg","dcswudvayg","tgqyuxybxaebhybmcerpukt","cjuggogqcl","qckfgewchcaoengxahntefwxeowv","wczxodyjvdfsskizleyur","nasecblh","nekrpdidaafynnmvceoocp","spzexvrnmtjrlolrwok","fldjukqcvtgfydxmpd","uzpoylgalxs","ncovocemtdqtmaspw","pufgtmbbctdlrqektkbrfknnq","ksnljaxemelyhkiqsfpsefatt","molmyesruj","qpqirfwvageprmwcmhwdoskuw","wuhl","bgtrtllcwyrjtsefucqiq","wgbywanomct","xakn","gixqvgkduzjgbhyqw","eezcoshqraxfoacrbgusfykwlzic","jkjkujyhyasywuhpriw","nlmenifdegnnbtxnekfx","lsuedpashqtvpwhpocmpgtfvhbgsne","khqmqxuoez","wnc","zukrsezzgpncl","jzjkylxyxarb","ifdqqkkqjysnbaqt","snjkwhigjstvkedsaikeyzclujg","vujxegrxnvwjdicjvxvul","dgnjiwwswvhvyloeoeomoqnzhj","kfinrxqgkydi","dzwcfppnttufohqs","gaifeclk","txsyxpvr","bxgaojrho","wvxdexfxwkbo","zhvpbaacysxqft","hvttbojadriberao","wcrycdkancrdhwasy","ud","uiodpovx","ahhict","vgyxvaeziytftohzalzprufo","oyctpzpmf","aahmjnoixelmlxmvoqcyibnofcuvdf","dezlxovpzshtvhjue","mivjzutpmdfazzmsgcckihjqwgw","rzcxmpvtteuzzmelimb","kkpwyoclmmatmneqehds","hetampokzgyxjk","ydymeuqycbdqarsfe","ghrrxqlfiqtcxiazl","dfmxvsjklaebldkcpxdswn","dyqahpcftwmfercccfpctisplm","uozusmwqelao","queextinmqhuutaqclqtjvxr","wqprpxxjafvzo","kiiddslchdhoznddfchqetav","qwuvbseogegyezrgxscsorrot","mrzhqwjubprihnhyyltipimv","hmdtgizrdzuevfgin","jvxevqgoxskqrwdnjnhmtspsvo","smwrlvbidmhdnneuydbkkawmqugn","oezyfxgnhffimixapb","nuefwhkyurvcjbvwhmvkrlblyf","mlmdspfbsqamwpphmijrsgsh","uhrzpowengyax","paegu","kvslaqkkmitq","mioortjtwtzin","enmpwaciylshgndbpw","lvxqwovhblvisydokmrxxiiu","ddkcbsheniinzg","eolbjpugwomqbbdgapkzhks","vmsnsrpojfogttcuvts","hjidytsrxpfblhjaha","lpzrdpguvczjpzvqkmgook","kjpzphmmudjjlnpknhmkear","luzsxjnbrctezizmwngrkisz","kvlnmvsjyuutwyspvxycdgyxzw","pbwdxhbnybl","eykbubzfwnxhespaqtoyjtqtjb","ptxmsskwgzbedcpx","cogqasrcvuslvxlhhboedjugdh","kknutguiglojtjfzuryofmjjjfwzgr","ygxuetnuos","ncgtpvmswrvjwvmtk","aadmcqiflhnweloutpmmcxqdboei","ndqexgsyte","wwnsggkbgus","utxlseqkbia","thmolyvbihyxyou","oklihfhoby","gunajyiyvimidhmtxfll","whahaabngiaoysboxq","blynzqjbadpahjylbzuueu","hobleggvipmjemivnr","bmmnugugebbyosuvep","dluydhy","tttfpuehlkoixjqegfa","nnairkcenziwapvrfsjqgmywi","qfnyenrfaaikqkppnigzinhdy","yypqsyrexkzj","cipwlwzw","eghnbftrcktbtnpu","jzrzxfcypculqwzkzmgbme","cvkordfnoqzajruydyu","hexmvtlgxtvdsxbcbodusbeiic","nzhscbtguqnoyext","scwtuhirxqsavmntlrfgaols","hkugstmncbhsxdhm","pnydadyoomzur","wergsyfbkshpslzjyffit","bartmccseewglptpeqgk","bwxkvohdlbbswaoiunbj","acwgmzjzejajutjsdbqtbv","jwvivodzfdcnevzlgwh","balefkhtjvmkjubrkzvrnzzkxn","tydbuotoebfmfv","mxcvmqqzszvp","zcohnjxyqboevvjdocxxupzmw","lxdtwiwdxiilrhd","ojpucddyouwnned","txgabdpornyhcxp","plvrwooftthwwpynritoouthcsbi","prnuztsuzkjfkwcacjazsqqaga","imywrljnrwbmwgmenuztvezuyxuwm","hluezbberpnpdamlz","aggjrgoreplckbexs","afzaczmlolhupepfaq","wcekafgkfpjjfagbtxxewj","unbvpnjjxihqavxlwjrxhrizywbivn","eeioqqjrennu","zeeswpbrczamijljr","bbaowbwosthjalsvgozvr","yegomgrpkssnudfxmnwksk","arudujypwbgijvirlithv","rjplawmoeslyitypetr","scngigstupotsmze","uisuenrfzszujoepotgvdghotglvhz","ugqivwxoxehqrstubnifpkaxg","dutsobnyoljgnqrg","lrppqxozcyokddbliyfoos","rmggqqitcqwklphrmznkksdo","qamazxwwrxgjbkxgdprkt","ydcrwwzvkvdasdschjtodau","inmjldtzrhmwkoorbnccwh","kukpzdiudhr","gzhkzatglr","ir","wvoqyoldcstnjhpvjngdohwdrjsb","dmwrdjfazseypzsyrtnxnaodtqigd","pddqmmrvhzeqtmpmnmhnsfdghn","macycpoxcbgtkbxovnsf","nybbhrhhu","wavwyhzxposjerktnhhxde","ufnizggmblxhuqwolhfqhmqu","wrgkejiasojqrbenvflget","jhzpkmnbjcevtbcozzhwlfwfiqf","oxxrctuoaurnykqkfwhjyikr","xahmkkfcjypgatrizan","dbynsfjcpg","qsmwgvyujuzvvxhoiqvzukfso","dsrvfracgkaztqmiudy","pajqaqkctwiskygm","pxxxnkhkzlcgsrxhfkcz","hcbtndyxgufdlsjbfcj","todpcgjbhhugxcqbkkbkhrlxe","ylvhwzkdqxvy","himahrfmlzw","uxepfyfpvpoywtbojxafpobn","oomoewwish","kokzivfdojpehqwmwbiyfhhlfw","fvjpqysbhmobtzkcnntn","wnpfwoebsd","vkepspvepzwsnddrqewrx","urmxwhoalpxxr","ddvugbpqvtfgclyyswrps","ksjmwwpjzwuffvga","fktsiwediublvpbjrzekckq","hdpezxvkgoxwhvbky","vseyndthxcuomvnfxsyxjkdjikm","jiskqfkrcrbgxbhcqrwqw","jsyyxcabwchgplqg","veukrsarxkrcowsn","hamgfqubgmtdglqrdiujufndawfrt","azhliztyvuyfrlleovssx","fvkzewdvppuerqxssbgqlmqeem","qjclrictlmookiikruszspbrpbttk","negzrxxcmlfkizyxbakzriiklvyavj","asw","cuzpsuthidv","fmutzcxzfosldkvrvdaxsemror","rkqifnchhfgkpnzkm","wtxeunjceayboesuvuhsnrpa","qlyjecialabklnegbqzm","dfkpdoqhnqvxweowe","djlwcendbtumnvrcjapgwmaxt","vxbhwvjhvcpidqtpvndmkece","nbdtfbphsutsldoyipycnextjzwd","abhoupmdnpuqskuroeyelxrerpqvw","nqgxhpfvgyzjfweyuqdjfhugw","vzrkwyvvtadlukhwuveeilfhu","otkamfwueylyosmi","wavatdqffsbnolefraerpj","merrjjpusypwgrx","hvbykobdaeepf","narscxvprvabmtsffzmhtteou","sfgszuenggcttagvtl","bpjosfnbxlphvkxncefahqyh","cmsbiyqgqfrknvawwq","bqbbglmqmklpygxpaieaxkagv","fxzajmuxhw","hcwbyznfimdofercpxysebfnai","ckvpsmhzuphpxymano","mchpbnjlivivgkgfpetqeakq","yyjgongiwtpr","fm","qlmtadnrpykkqi","dwrgbsukttrpxhalemrbldj","iqgdfhrabtqrbufkrdmviiz","zvwlegcdjzhakieueypkvxdcow","xneepfxxpgkyzinabhkrhljszlykaj","puvlodrotntrakl","rrxggkxgfbnjwd","ifcqrllroao","qwmtaadtsyjbsurfwxx","ljxwdiryakvhrilaqys","vaqbbvxhokfkqwsdrkkvdu","vuvtdzknxf","niniygsnzw","noubnlubybytcmmwckbtrdnunjii","xruadtaysznwydbizugorbsnrfffko","bdmnexqguihqngopgodegqrckr","xgdxmhuqkdmyskz","xulmgbujdrxoaojnffkjkd","yjhmansypslkjt","yoqleeamjloiavtekgulot","kgmfjqkobsvzqstjsphohqkzq","bjeldhnisqbdxtbfqqdzyl","wnrbvkwevhhlmbpvi","cyyojoqzfzfzxsgpwqm","snbazupyvsp","dvxuzkibncubmjphscvkowtdqrjcq","dfoleizrxidahmiodfzosdu","qlydusnctuot","wcbocbtozj","cvzifxctlkvnqspdjddqleczfa","ldrngmhakvylmxxrfowhth","kplhwlleknvo","adzbbopjjrlgylanwjtjvd","cmbvgrptnmzrmiysebpjcpdqbxz","zdbgvclgzj","biqjumgodmtgtnguemq","ceykituczcwefsr","sevgits","pqzfdwdjerkxsavbyhjouzunypq","dptohjhrkbveuczayrahivfszwhp","ivrtymvxkvaonrgnmvdwa","phbafmfeidxzaxab","koyxeahoblorpngo","aeztlrcapmrkytqlvuxmwmvbxtucbh","ictgheysrkivzohqkhdeg","mxhlyqklkvtnvrtflavec","lh","uoajgxpyzlaihys","dfuwytwjahnqhprroerbgsnfp","ezkksbeyvfcfkikkchnsqglcag","drwaorqjvgrk","ncogkvatdtmmhqzqejgbzrk","vfwrywkcfrbmrrhxwvuvicbwpf","iahwbwchhzlheqprjjueb","kliwpoodiokpkrbhiy","airzyxotvzmlvfagi","qdriglsutp","whozxobdhnworutrlcoiffwszg","tbdsbdlbdrqdtr","faqqrmohaduowqkyprccfir","itsmgtabzp","xs","pbxohpornwpcblciklwdrcmu","jonmnigpygucpij","wcoiexamjrazglooz","vcxdnttuzemi","zmjzzwgpzlcfxmcbqvaoyffakya","tfikutntimcxfx","gkzudqmsvyottiwsg","vkcxgtxjwm","wscfjvrfrvrv","tllhuyefwtojhyuibaixhexcybvw","afmtwhhvdkqytzmxsidzmqubfqvyyj","eowsxgyyofjdmnhhgcnzoigrqafqgn","hmrzinnpwy","xhxjfynmmpebbkdcpzlxd","wjrzuhqmzoyunwizyub","hwxgwsvooqsbakqkxzjmymktboym","zfyjgsifzhgigogcyjaugr","rnkyebvjhmkplnkjgs","tzwlcumkhtsxtzh","tiptnidreaxclvf","ofcndbrybziorodtaulfoyjy","kqgkebdhnbtoimsonst","lwizgcqrduej","ibnlieuwnidxdzuupif","uwiyvbjqyifcgffke","mstzwgzfzvb","qaibythdkmmtjxycefhycabdtb","fawhkzixowdtkgferehwmypfyjdyq","zpjdpknmrdxyqasf","qclocbxtonrmzodjhcmxtvese","wspktfagcrbnqjzzmsbhfb","tbgluthursgpkkdlvxaq","cwnmagejhxkchcegbfpgus","epseonoamwggurnafeoqzfkr","nmmjjtsnjro","wbumdtgplnqrcqpolw","nqhntyowntefzngyfdt","qsjristvkuxhfuxvr","yihzwijjopeboitbavgozsi","dvtvjglricwtvqqtaqgvzyey","cllrqtgqnv","xfcacfuboriw","xtjkywuvtdqvvfqrfsncuw","dfuheuiksqgecptw","tgscckicwdpoonenfpvkbza","vojnqukddpudjpzrqqmnkcdqlj","ggicfqqmpwszrzrajktnbd","cxbkfbgqhvoqw","lpgkekjugfegyrivnwetkioa","pzojdwhqpxjxdt","bahotkdralteqnyogjy","ewphtuobmfwcuw","paqtiobamiqwliuubxdg","suhivzahtprbdfffkahxxiziw","xmwsadxwih","mnyyaxfbtqujflsper","shxjizabmpwqjlwxjkwpddxm","wwroxhrfiige","nutwydedwerdxm","favlhyawpwhcvnyuzpfzjedsncvbp","kzqpykntqxyvwksf","ibmeuekwmsnjlyoufncfyqirqqrhck","ecqywwanicqvfituenfvjslmyo","mzevhilyddihkalwlzvndvhbnpkop","bazn","aehvefxagkxohzsg","yesxthkjwqlbetxn","iaivxvuysdclrkcstogzjcuoqdnif","aiswssbxulzjhvg","nsueyanoyfmjrnxqu","efznwtzrzknuvstog","fcohdjpjgyvuln","hllaopjtzeksuzkfmdpe","ggigdrfgoibeppb","yuuzfdaluvxczipnfhbhkuldvyrnwv","oivwakxegbsl","xgkzgepdzi","jcmmbquadnszzgymr","szkrhhudumy","owyqwoijnlfwpzxkeedwktfl","zixchmetqsgcdoajpysu","hkorjezecjpmvqctcjpjf","milojegdhlreaot","dgzrhxnjyvevbtrfjmmyanjpve","xxoh","mugfwwiwrvbjhmljpqpbpsiyu","gvtmgicztnanyjwmo","qncqaxxwaixqhsuhuenwizwlkfecvn","xmbkdpo","igytdyucqiszwzf","gmcwbzbmlijmubqbvypklnphop","pvyjgcixaafvcvcvsz","fcwufjsiymkzgzfolsygnevg","zhfpjtstjhvroegd"};
		String result[] = findRestaurant(arr1, arr2);
		for(String i:result)
			System.out.println(i);
	}

	public static String[] findRestaurant(String[] list1, String[] list2) {
		
		if(list1 == null || list2 == null)
			return null;
		HashMap<String, Integer> p1 = new HashMap<String, Integer>(list1.length);
		HashMap<Integer, ArrayList<String>> p2 = new HashMap<Integer, ArrayList<String>>();
		for(int i =0; i<list1.length; i++)
			p1.put(list1[i], i);

		Integer pos;
		int min = Integer.MAX_VALUE, position = 0;
		ArrayList<String> arr;
		for(int i =0; i<list2.length; i++){ 
			pos = p1.get(list2[i]);
			if(pos!=null){
				position = pos + i;
				arr = p2.get(position);
				if(arr == null)
					arr = new ArrayList<String>();
				arr.add(list2[i]);
				p2.put(position, arr);
				if(min > position)
					min = position;
			}
		}
		arr = p2.get(min);
		return arr.toArray(new String[arr.size()]);
	}
}
