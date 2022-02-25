package ch8_ExceptionHandling.ex21;
/*
* 사용자 정의 예외 만들기
* 보통 Exception 클래스로부터 상속받는 클래스로 만든다. 이렇게 상속받으면 생성자를 통해 String값을 받아 메세지를 저장할 수 있다.
* */
public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러 메세지:" + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기를 바랍니다.");
        } catch (MemoryException e) {
            System.out.println("에러 메세지:" + e.getMessage());
            e.printStackTrace();
            System.gc();    // 가비지 콜렉터를 수행하여 메모리를 늘려줍니다.
            System.out.println("다시 설치를 시도하세요");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치할 공간이 부족합니다.");
        if (!enoughMemory())
            throw new MemoryException("메모리가 부족합니다.");
    }
    static void copyFiles() {
        // 파일들을 복사하는 코드가 있다고 가정
    }
    static void deleteTempFiles(){
        // 임시파일들을 삭제하는 코드가 있다고 가정
    }

    static boolean enoughSpace() {
        // 설치하는 필요한 공간이 있는지 확인하는 코드가 있다고 가정
        return false;
    }
    static boolean enoughMemory() {
        // 설치하는 필요한 메모리가 있는지 확인하는 코드가 있다고 가정
        return true;
    }
}

class SpaceException extends Exception {
    SpaceException(String msg){
        super(msg); // super()는 부모 클래스의 생성자를 의미한다.
    }
}
class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}