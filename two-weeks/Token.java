/*
 * @Author: xiuquanxu
 * @Company: kaochong
 * @Date: 2020-10-19 13:07:35
 * @LastEditors: xiuquanxu
 * @LastEditTime: 2020-10-26 22:40:48
*/
// 词法分析正则表达式
// 整形字面量: [0-9]+
// 标识符: [A-Z_a-z][A-Z_a-z0-9]*|=|==|+|-|>=|<=|&&|\|\||\p{Punct}
// 字符串字面量: "(\\"|\\\\|\\n|[^"])*"
// 最后综合匹配空格和注释：i\s*((//.*) | (par1) | (pat2) | pat3)?
public abstract class Token {
    private int lineNumber;
    protected Token(int line) {
        lineNumber = line;
    }

    public static final Token EOF = new Token(-1){};
    public static final String EOL = "\\n";

    public int getLiineNumber() {return lineNumber;}

    public boolean isIdentifier() {return false;}

    public boolean isNumber() {return false;}

    public static void main(String[] args){
        System.out.println("Hello World!");
    }
}