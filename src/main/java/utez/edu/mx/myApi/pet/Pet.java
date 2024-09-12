package utez.edu.mx.myApi.pet;

import jakarta.persistence.*;

@Entity
@Table(name = "Pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "nickname", nullable = false)
    private String nickname;

    @Column(name = "height", nullable = false)
    private int height;

    @Column(name = "weight", nullable = false)
    private int weight;

    public Pet() {
    }

    public Pet(long id, String nickname, int height, int weight) {
        this.id = id;
        this.nickname = nickname;
        this.height = height;
        this.weight = weight;
    }

    public Pet(String nickname, int height, int weight) {
        this.nickname = nickname;
        this.height = height;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

}

