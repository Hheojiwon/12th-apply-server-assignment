package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//60222539 정보통신공학과 허지원

class StudyRoom{ //studyRoom 클래스
    String studyRoomName; //스터디룸 이름
    int startTime, endTime;

    StudyRoom(){}
}

class Reservation extends StudyRoom {

    static boolean[][] available = new boolean[13][3];


    static void reserve(StudyRoom s) {
        int roomIndex = -1; //기본 값
        if (s.studyRoomName.equals("A")) {
            roomIndex = 0; //A 일때 0
        } else if (s.studyRoomName.equals("B")) {
            roomIndex = 1; //B 일때 1
        } else if (s.studyRoomName.equals("C")) {
            roomIndex = 2; //C 일때 2
        }

        if (roomIndex == -1) {
            System.out.println("스터디룸 " + s.studyRoomName + "은 존재하지 않는 스터디룸입니다.\n 예약에 실패했습니다.");
            return;
        }

        boolean bool = true;

        for (int i = s.startTime - 10; i < s.endTime - 10; i++) {
            if (available[i][roomIndex]) { //예약되어 있으면
                bool = false; //false
                break;
            }
        }

        if (bool) { //모든 자리가 비어있으면
            for (int i = s.startTime - 10; i < s.endTime - 10; i++) {
                available[i][roomIndex] = true; //예약하기
            }
            System.out.println("스터디룸 " + s.studyRoomName + "이(가) " + s.startTime + "시부터 " + s.endTime + "시까지 예약되었습니다.");
        }
        else {
            System.out.println("스터디룸 " + s.studyRoomName + "는 해당 시간에 이미 예약되어 있습니다. \n 예약에 실패했습니다.");
        }
    }

    void print() {
        System.out.println("----- 예약 현황 -----\n" + "| A | B | C |");
        for (int i = 0; i < available.length; i++) {
            System.out.print((i + 10) + "시 | ");
            for (int j = 0; j < available[i].length; j++) {
                if (!available[i][j]) {
                    System.out.print("X | "); // 예약이 되어있지 않은 경우 X를 출력
                } else {
                    System.out.print("O | "); // 예약이 되어있는 좌석은 O 출력
                }
            }
            System.out.println();
        }
    }

}






public class Main {

    static Scanner sc = new Scanner(System.in);


    static int menu() { //메뉴

        System.out.println("----- 작업 -----");
        System.out.println();
        System.out.println("1. 스터디룸 예약");
        System.out.println("2. 예약 현황 조회");
        System.out.println("3. 문의 남기기");
        System.out.println("4. 문의 리스트 보기");
        System.out.println("5. 프로그램 종료");
        System.out.println();
        System.out.print("작업을 선택하세요 :");
        int order = sc.nextInt();

        return order;
    }


    public static void main(String[] args) {
        String studyRoomName;
        int startTime, endTime;
        Map<String, String> map = new HashMap<>();

        Reservation r = new Reservation(); //Reservation 객체 r 생성

        System.out.println("스터디룸 예약 프로그램입니다.");
        while (true) {
            int order = menu();
            if (order == 1) {
                StudyRoom studyRoom = new StudyRoom();
                System.out.print("예약할 스터디룸: ");
                studyRoom.studyRoomName = sc.next();
                System.out.print("사용 시작 시간: ");
                studyRoom.startTime = sc.nextInt();
                System.out.print("사용 종료 시간: ");
                studyRoom.endTime = sc.nextInt();
                r.reserve(studyRoom);


            } else if (order == 2) {
                r.print();
            } else if (order == 3) {
                System.out.println("-----문의 남기기-----");
                System.out.print("문의 아이디: ");
                String id = sc.next();
                System.out.print("문의 내용: ");
                String content = sc.next();
                map.put(id, content);
                System.out.println("문의가 저장되었습니다!");
            } else if (order == 4) {
                System.out.println("-----문의 리스트 보기-----");
                for (String key : map.keySet()) {
                    System.out.println("문의 아이디: " + key);
                    System.out.println("문의 내용: " + map.get(key));
                    System.out.println();
                }


            } else if (order == 5) {
                System.out.println("프로그램을 종료합니다...");
                break;
            }
        }
    }
}




