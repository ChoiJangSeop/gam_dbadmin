package gam.jangseop.dbadmin.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
@NoArgsConstructor
@Table(name = "userinfo")
public class UserInfo {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "fdusernum")
    private Long id;

    @Column(name = "fdauthusernum")
    private Long authId;

    @Column(name = "fdchannelnum")
    private Long channelId;

    @Column(name = "fdattribute")
    private int attribute;

    @Column(name = "fdinserttime")
    private LocalDateTime insertTime;

    @Column(name = "fduid")
    private String UID;

    @Column(name = "fdnickname")
    private String nickname;

    @Column(name = "fdoption")
    private int option;

    // TODO 생성메서드
    public static UserInfo createUserInfo(String UID, String nickname, int option) {
        UserInfo userInfo = new UserInfo();
        userInfo.authId = -1L;
        userInfo.channelId = -1L;
        userInfo.attribute = 0;
        userInfo.insertTime = LocalDateTime.now();
        userInfo.UID = UID;
        userInfo.nickname = nickname;
        userInfo.option = option;

        return userInfo;
    }

    //== 비지니스 메서드 ==//
    public void setAll(String UID, String nickname, int option) {
        this.UID = UID;
        this.nickname = nickname;
        this.option = option;
    }

}
