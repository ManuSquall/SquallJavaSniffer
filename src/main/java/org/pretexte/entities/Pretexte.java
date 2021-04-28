package org.pretexte.entities;

public class Pretexte {


    String totalConfirme;
    String totalSousTraitement;
    String totalGueris;
    String districtsTouches;
    String totalDeces;
    String totalEvacues;
    String totalMonde;
    String totalAfrique;

    public String getTotalConfirmé() {
        return totalConfirme;
    }

    public void setTotalConfirmé(String totalConfirmé) {
        this.totalConfirme = totalConfirmé;
    }

    public String getTotalSousTraitement() {
        return totalSousTraitement;
    }

    public void setTotalSousTraitement(String totalSousTraitement) {
        this.totalSousTraitement = totalSousTraitement;
    }

    public String getTotalGueris() {
        return totalGueris;
    }

    public void setTotalGueris(String totalGueris) {
        this.totalGueris = totalGueris;
    }

    public String getDistrictsTouches() {
        return districtsTouches;
    }

    public void setDistrictsTouches(String districtsTouches) {
        this.districtsTouches = districtsTouches;
    }

    public String getTotalDeces() {
        return totalDeces;
    }

    public void setTotalDeces(String totalDeces) {
        this.totalDeces = totalDeces;
    }

    public String getTotalEvacues() {
        return totalEvacues;
    }

    public void setTotalEvacues(String totalEvacues) {
        this.totalEvacues = totalEvacues;
    }

    public String getTotalMonde() {
        return totalMonde;
    }

    public void setTotalMonde(String totalMonde) {
        this.totalMonde = totalMonde;
    }

    public String getTotalAfrique() {
        return totalAfrique;
    }

    public void setTotalAfrique(String totalAfrique) {
        this.totalAfrique = totalAfrique;
    }



    public Pretexte(String totalConfirme, String totalSousTraitement, String totalGueris, String districtsTouches, String totalDeces, String totalEvacues, String totalMonde, String totalAfrique) {
        this.totalConfirme = totalConfirme;
        this.totalSousTraitement=totalSousTraitement;
        this.totalGueris=totalGueris;
        this.districtsTouches=districtsTouches;
        this.totalDeces=totalDeces;
        this.totalEvacues=totalEvacues;
        this.totalMonde=totalMonde;
        this.totalAfrique=totalAfrique;
    }

    }

