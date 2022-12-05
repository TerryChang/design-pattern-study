package com.youngjin.designpattern.chapter15.A3;

public class Main {
    public static void main(String[] args) {
        String title = "Welcome!";
        String message = "Hello, world!";
        /*
        String html = """
        <!DOCTYPE html>
        <html>
            <head>
                <title>%s</title>
            </head>
            <body>
                <h1 style="text-align: center">%s</h1>
            </body>
        </html>
        """.formatted(title, message);
        */
        // 책의 원래 소스는 위의 주석처리한 부분이지만 이 문법은 jdk 15 이상을 써야 인식이 된다(Text Block 문법과 String 클래스의 formatted 메소드)
        // jdk 15 미만인 버전과의 호환성을 맞추기 위해 아래와 같이 수정했다
        String html = "" +
                "<!DOCTYPE html>\n" + 
                "<html>\n" + 
                "    <head>\n" + 
                "        <title>%s</title>\n" + 
                "    </head>\n" + 
                "    <body>\n" + 
                "        <h1 style=\"text-align: center\">%s</h1>\n" + 
                "    </body>\n" + 
                "</html>" + 
                "";
        String.format(html, title, message);
        System.out.print(html);
    }
}
