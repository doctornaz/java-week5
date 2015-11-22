//No ha sido probado aun
public class StringUtilTest{
    public static void main(String [] args){
        //Pueden usarlos a medida que los vayan necesitando
        testAddCommasToNumericString();
        testRemoveAllOccurrences();
        testCountWordsOfAText();
        testBlow();
        testMaxRun();
    }
	

    public static void testAddCommasToNumericString(){
        assert("1".equals(StringUtil.addCommasToNumericString("1")));
        assert("10".equals(StringUtil.addCommasToNumericString("10")));
        assert("100".equals(StringUtil.addCommasToNumericString("100")));
        assert("1,000".equals(StringUtil.addCommasToNumericString("1000")));
        assert("10,000".equals(StringUtil.addCommasToNumericString("10000")));
        assert("100,000".equals(StringUtil.addCommasToNumericString("100000")));
        assert("1,000,000".equals(StringUtil.addCommasToNumericString("1000000")));
    }

    public static void testRemoveAllOccurrences(){
        assert("ola".equals(StringUtil.removeAllOccurrences("Hola",'H')));
        assert("Hola".equals(StringUtil.removeAllOccurrences("Hola",'h')));
        assert("  ".equals(StringUtil.removeAllOccurrences("e e e",'e')));
        assert("0".equals(StringUtil.removeAllOccurrences("----0----",'-')));
        assert("00".equals(StringUtil.removeAllOccurrences("----0----0----",'-')));
    }
	
    public static void testCountWordsOfAText(){
        assert(0==StringUtil.countWordsOfAText(""));
        assert(1==StringUtil.countWordsOfAText("Hola"));
        assert(3==StringUtil.countWordsOfAText("Hola que tal"));
    }

    public static void testBlow(){
        assert("".equals(StringUtil.blow("")));
        assert("xx".equals(StringUtil.blow("2x")));
        assert("".equals(StringUtil.blow("0x")));
        assert("xxyyy".equals(StringUtil.blow("2x3y")));
        assert("xxyyyxx".equals(StringUtil.blow("2x3y2x")));
    }

    public static void testMaxRun(){
        assert(0==StringUtil.maxRun(""));
        assert(1==StringUtil.maxRun("xyz"));
        assert(2==StringUtil.maxRun("xxy"));
        assert(2==StringUtil.maxRun("xyy"));
        assert(3==StringUtil.maxRun("xxysyyxx"));
        assert(4==StringUtil.maxRun("xxyyyxxyyyyxxyy"));
        assert(5==StringUtil.maxRun("xxyyyxxzzzzzxxyy"));
    }

}