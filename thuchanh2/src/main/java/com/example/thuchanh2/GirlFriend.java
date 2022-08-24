package com.example.thuchanh2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GirlFriend {
//    @Autowired : Cách 1 - Tạo ra 1 object outfit
    @Autowired
    @Qualifier("bikini2")
    public Outfit outfit;

    public GirlFriend() {
        this.outfit = new Dress();
    }

//    @Autowired : Cách 2 - Thêm vào trước contructor
    public GirlFriend(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }


//    Autowired : Cách 3 -
    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
