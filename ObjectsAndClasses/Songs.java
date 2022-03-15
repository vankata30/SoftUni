package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Songs {
    static class Song {
        String typeList;
        String name;
        String time;

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song currentSong = new Song();
            currentSong.setTypeList(type);
            currentSong.setName(name);
            currentSong.setTime(time);

            songList.add(currentSong);
        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song item : songList){
                System.out.println(item.getName());
            }
        } else {
            for (Song item : songList){
                if (item.getTypeList().equals(command)){
                    System.out.println(item.getName());
                }
            }
        }
    }
}
