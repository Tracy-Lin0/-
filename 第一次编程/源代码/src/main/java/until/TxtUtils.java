package until;

import java.io.*;

public class TxtUtils {

    /**
     * 通过绝对路径读取Txt文件，返回String字符串
     *
     * @param filePath Txt文件绝对路径
     * @return str Txt文件的String字符串
     */
    /*public static String getTxtString(String filePath) {
        if (null == filePath) {
            try {
                throw new FileNotFoundException("文件名错误");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        File file = new File(filePath);
        if (!file.exists() || !file.isFile()) {
            try {
                throw new FileNotFoundException("文件错误，请重新检查文件名或者该路径是否是文件夹");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        String str = "";
        String strLine;
        // 将 txt文件按行读入 str中
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // 字符串拼接
            while ((strLine = bufferedReader.readLine()) != null) {
                str += strLine;
            }
            // 关闭资源
            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 遍历一个文件夹下的所有Txt文件
     *
     * @param filepath
     * @return 目录下的文件名
     */
    /*public static String[] iterateFile(String filepath) {
        File file = new File(filepath);
        //System.out.println(file.getName());
        if (file.isFile()) {
            //是文件
            System.out.println("\t" + file.getName());
            String[] files = new String[1];
            files[0] = file.getAbsolutePath();
            return files;
        } else {
            String[] files = file.list();
            return files;
        }
    }

    public static void write(String name, String context) {
        if (null == name || null == context) {
            System.out.println("请输出正确的格式");
            return;
        }
        File file = new File(name);
        BufferedWriter writer = null;
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (!file.isFile()) {
            System.out.println("路径：" + name + " 不是文件，写入文件失败");
            return;
        }
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(context);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != writer) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/

        /**
         * 读出txt文件
         * 传入文件绝对路径，将文件内容转化为 String字符串输出
         * @param txtPath 文件路径
         * @return 文件内容
         */
        public static String readTxt(String txtPath) {
            String str = "";
            String strLine;
            // 将 txt文件按行读入 str中
            File file = new File(txtPath);
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                // 字符串拼接
                while ((strLine = bufferedReader.readLine()) != null) {
                    str += strLine;
                }
                // 关闭资源
                inputStreamReader.close();
                bufferedReader.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        /**
         * 写入txt文件
         * 传入内容、文件全路径名，将内容写入文件并换行
         * @param txtElem 传入的内容
         * @param txtPath 写入的文件路径
         */
        public static void writeTxt(double txtElem,String txtPath){
            String str = Double.toString(txtElem);
            File file = new File(txtPath);
            FileWriter fileWriter = null;
            try {
                fileWriter = new FileWriter(file, true);
                fileWriter.write(str, 0, (str.length() > 3 ? 4 : str.length()));
                fileWriter.write("\r\n");
                // 关闭资源
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

