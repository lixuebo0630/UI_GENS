package com.example.chengzj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;


public class DimenTool {

    public static void gen() {


        File file = new File("./app/src/main/res/values/dimens.xml");
        BufferedReader reader = null;
//        StringBuilder sw180 = new StringBuilder();
        StringBuilder sw240 = new StringBuilder();
        StringBuilder sw320 = new StringBuilder();
        StringBuilder sw360 = new StringBuilder();
        StringBuilder sw384 = new StringBuilder();
        StringBuilder sw400 = new StringBuilder();
        StringBuilder sw411 = new StringBuilder();
        StringBuilder sw480 = new StringBuilder();
        StringBuilder sw600 = new StringBuilder();
        StringBuilder sw720 = new StringBuilder();
        StringBuilder sw768 = new StringBuilder();
        StringBuilder sw800 = new StringBuilder();
        StringBuilder sw900 = new StringBuilder();
        StringBuilder sw960 = new StringBuilder();
        StringBuilder sw1024 = new StringBuilder();
//        StringBuilder sw1280 = new StringBuilder();

        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString;
            int line = 1;

            while ((tempString = reader.readLine()) != null) {

                if (tempString.contains("</dimen>")) {
                    //tempString = tempString.replaceAll(" ", "");
                    String start = tempString.substring(0, tempString.indexOf(">") + 1);
                    String end = tempString.substring(tempString.lastIndexOf("<") - 2);
                    float num = Float.valueOf(tempString.substring(tempString.indexOf(">") + 1, tempString.indexOf("</dimen>") - 2));

                    /**
                     * 根据UI画布大小比例进行换算，UI图相对分辨率为1334x750
                     * 设备默认缩放因子密度为 2  = 320 / 160
                     */
                    int density = 3;
                    int width = 1200 / density;

                    /**
                     * 如果设计图尺寸为1080x1920
                     * 高分率缩放因子密度一般为 3 = 480 / 160 ，则：
                     * 可选项，根据你实际的UI设计图来定义
                     */
                    density = 2;
                    width = 1200 / density;

                    DecimalFormat format = new DecimalFormat("##0.00");

                    sw240.append(start).append(format.format(num * 240 / width)).append(end).append("\n");
                    sw320.append(start).append(format.format(num * 320 / width)).append(end).append("\n");
                    sw360.append(start).append(format.format(num * 360 / width)).append(end).append("\n");
                    sw400.append(start).append(format.format(num * 400 / width)).append(end).append("\n");
                    sw384.append(start).append(format.format(num * 384 / width)).append(end).append("\n");
                    sw411.append(start).append(format.format(num * 411 / width)).append(end).append("\n");
                    sw480.append(start).append(format.format(num * 480 / width)).append(end).append("\n");
                    sw600.append(start).append(format.format(num * 600 / width)).append(end).append("\n");
                    sw720.append(start).append(format.format(num * 720 / width)).append(end).append("\n");
                    sw768.append(start).append(format.format(num * 768 / width)).append(end).append("\n");
                    sw800.append(start).append(format.format(num * 800 / width)).append(end).append("\n");
                    sw900.append(start).append(format.format(num * 900 / width)).append(end).append("\n");
                    sw960.append(start).append(format.format(num * 960 / width)).append(end).append("\n");
                    sw1024.append(start).append(format.format(num * 1024 / width)).append(end).append("\n");
//                    sw1280.append(start).append((int) Math.round(num * 1280 / width)).append(end).append("\n");


                } else {
//                    sw180.append(tempString).append("\n");
                    sw240.append(tempString).append("\n");
                    sw320.append(tempString).append("\n");
                    sw360.append(tempString).append("\n");
                    sw400.append(tempString).append("\n");
                    sw384.append(tempString).append("\n");
                    sw411.append(tempString).append("\n");
                    sw480.append(tempString).append("\n");
                    sw600.append(tempString).append("\n");
                    sw720.append(tempString).append("\n");
                    sw768.append(tempString).append("\n");
                    sw800.append(tempString).append("\n");
                    sw900.append(tempString).append("\n");
                    sw960.append(tempString).append("\n");
                    sw1024.append(tempString).append("\n");
//                    sw1280.append(tempString).append("\n");
                }
                line++;
            }
            reader.close();
            System.out.println("<!--  sw480 -->");
            System.out.println(sw480);
            System.out.println("<!--  sw600 -->");
            System.out.println(sw600);

            System.out.println("<!--  sw720 -->");
            System.out.println(sw720);
            System.out.println("<!--  sw1024 -->");
            System.out.println(sw1024);

            String sw240file = "./app/src/main/res/values-sw240dp/dimens.xml";
            String sw320file = "./app/src/main/res/values-sw320dp/dimens.xml";
            String sw360file = "./app/src/main/res/values-sw360dp/dimens.xml";
            String sw400file = "./app/src/main/res/values-sw400dp/dimens.xml";
            String sw384file = "./app/src/main/res/values-sw384dp/dimens.xml";
            String sw411file = "./app/src/main/res/values-sw411dp/dimens.xml";
            String sw480file = "./app/src/main/res/values-sw480dp/dimens.xml";
            String sw600file = "./app/src/main/res/values-sw600dp/dimens.xml";
            String sw720file = "./app/src/main/res/values-sw720dp/dimens.xml";
            String sw768file = "./app/src/main/res/values-sw768dp/dimens.xml";
            String sw800file = "./app/src/main/res/values-sw800dp/dimens.xml";
            String sw900file = "./app/src/main/res/values-sw900dp/dimens.xml";
            String sw960file = "./app/src/main/res/values-sw960dp/dimens.xml";
            String sw1024file = "./app/src/main/res/values-sw1024dp/dimens.xml";

//            writeFile(sw180file, sw180.toString());
            writeFile(sw240file, sw240.toString());
            writeFile(sw320file, sw320.toString());
            writeFile(sw360file, sw360.toString());
            writeFile(sw400file, sw400.toString());
            writeFile(sw384file, sw384.toString());
            writeFile(sw411file, sw411.toString());
            writeFile(sw480file, sw480.toString());
            writeFile(sw600file, sw600.toString());
            writeFile(sw720file, sw720.toString());
            writeFile(sw768file, sw768.toString());
            writeFile(sw800file, sw800.toString());
            writeFile(sw900file, sw900.toString());
            writeFile(sw960file, sw960.toString());
            writeFile(sw1024file, sw1024.toString());
//            writeFile(sw1280file, sw1280.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }

    private static void writeFile(String file, String text) throws IOException {
        CreateFileUtil.createFile(file);
        PrintWriter out = null;
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            out = new PrintWriter(new BufferedWriter(fileWriter));
            out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }

    private static void genBaseDimensSize() {
        System.out.println("<!--   ******************************Font******************************* -->");
        for (int i = 6; i <= 36; i++) {
            StringBuilder sb = new StringBuilder("<dimen name=\"font_size_");
            sb.append(i).append("\">").append(i).append("sp</dimen>");
            System.out.println(sb.toString());
        }
        System.out.println("<!--   ******************************Widget******************************* -->");
        for (int i = 1; i <= 400; i++) {
            StringBuilder sb = new StringBuilder("<dimen name=\"ze_");
            sb.append(i).append("\">").append(i).append("dp</dimen>");
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        gen();
//        genBaseDimensSize();
    }
}
