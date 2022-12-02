package com.company.days;

public enum Day {
    PONDELI("Pondělí", "Máma: 'Tomáááááááááášííííííííííííííííííí!!!!!!!! OOOOOOOOOVLLLLLLLLLLAAAAAAAAAAAAADAAAAAAAAAAAAAAAAAAAAČČČČČČČČČČČČČČČČČČČČ A KAFEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!!!!!!!!!!!'"),
    UTERY("Úterý", "Máma: 'Vstávej Tomáši, musíš mi udělat kafe, nebo ti zabavím počítač.'"),
    STREDA("Středa", "Nevlastní táta: 'TOMANEEEEEEEEEEEEEEEEEE, MAZEJ POSEKAT ZAHRADU'"),
    CTVRTEK("Čtvrtek", "Máma: 'Proč smažíš?!?!?!?!?!??!?!?! TÁÁÁHNIII DO ŠKOLYYYYYY!!!!!!!!!!!!!!!!'"),
    PATEK("Pátek", "Nevlastní táta: 'Máš už zabaleno na chalupu?!?!?!?! a noutbúk necháš doma!!!!'");

    private String name;
    private String info;

    Day(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
