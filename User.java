/**
 * 사용자 정보에 대응하는 클래스
 */
public class User {
    /**
     * 사용자 이름 지정
     * 만일 기존에 이미 이름이 있는 경우 overwrite 이 지정되지 않으면 무시함
     * 
     * @param name 새 이름
     * @param overwrite 기존에 지정된 이름을 덮어쓸지 여부
     */
    public void setName(String name, Boolean overwrite) {}

    /**
     * 사용자 이름 반환
     * 
     * @return 사용자 이름으로 지정된 값. 없으면 NULL 임
     */
    public String getName() {}
}
