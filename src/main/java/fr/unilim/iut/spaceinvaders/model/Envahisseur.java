package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite {

	boolean dirGauche;
	
	public Envahisseur(Dimension dimensionEnvahisseur, Position positionOrigineEnvahisseur, int vitesseEnvahisseur) {
		super(dimensionEnvahisseur, positionOrigineEnvahisseur, vitesseEnvahisseur);
		this.dirGauche = true;
	}

	public boolean isDirGauche() {
		return dirGauche;
	}

	public void setDirGauche(boolean dirGauche) {
		this.dirGauche = dirGauche;
	}
	
	
	
	
	
}
