package com.composent.handy;

import java.io.Serializable;

public class InitialParams implements Serializable {

	private static final long serialVersionUID = -5028277778279500246L;
	
	public static final double NORMAL_MIN_DEATH_RATE = 1.0E-2;
	public static final double FAMINE_MAX_DEATH_RATE = 7.0E-2;
	public static final double COMMONER_BIRTH_RATE = 3.0E-2;
	public static final double ELITE_BIRTH_RATE = 3.0E-2;
	public static final double SUBSISTENCE_PER_CAPITA = 5.0E-4;
	public static final double THRESHOLD_WEALTH_PER_CAPITA = 5.0E-4;
	public static final double REGENERATION_RATE_OF_NATURE = 1.0E-2;
	public static final double NATURE_CARRYING_CAPACITY = 1.0E2;
	public static final double INEQUALITY_FACTOR = 1;
	public static final double DEPLETION_FACTOR = 0;
	public static final double COMMONER_POPULATION = 1.0E2;
	public static final double ELITE_POPULATION = 0;
	public static final double NATURE = NATURE_CARRYING_CAPACITY;
	public static final double ACCUMULATED_WEALTH = 0;
	
	private double alpham = NORMAL_MIN_DEATH_RATE;
	private double alphaM = FAMINE_MAX_DEATH_RATE;
	private double betaC = COMMONER_BIRTH_RATE;
	private double betaE = ELITE_BIRTH_RATE;
	private double s = SUBSISTENCE_PER_CAPITA;
	private double rho = THRESHOLD_WEALTH_PER_CAPITA;
	private double gamma = REGENERATION_RATE_OF_NATURE;
	private double lambda = NATURE_CARRYING_CAPACITY;
	private double kappa = INEQUALITY_FACTOR;
	private double delta = DEPLETION_FACTOR;
	
	private double xc = COMMONER_POPULATION;
	private double xe = ELITE_POPULATION;
	private double y = lambda;
	private double w = ACCUMULATED_WEALTH;
	
	public double getAlpham() {
		return alpham;
	}
	public void setAlpham(double alpham) {
		this.alpham = alpham;
	}
	public double getAlphaM() {
		return alphaM;
	}
	public void setAlphaM(double alphaM) {
		this.alphaM = alphaM;
	}
	public double getBetaC() {
		return betaC;
	}
	public void setBetaC(double betaC) {
		this.betaC = betaC;
	}
	public double getBetaE() {
		return betaE;
	}
	public void setBetaE(double betaE) {
		this.betaE = betaE;
	}
	public double getS() {
		return s;
	}
	public void setS(double s) {
		this.s = s;
	}
	public double getRho() {
		return rho;
	}
	public void setRho(double rho) {
		this.rho = rho;
	}
	public double getGamma() {
		return gamma;
	}
	public void setGamma(double gamma) {
		this.gamma = gamma;
	}
	public double getLambda() {
		return lambda;
	}
	public void setLambda(double lambda) {
		this.lambda = lambda;
	}
	public double getKappa() {
		return kappa;
	}
	public void setKappa(double kappa) {
		this.kappa = kappa;
	}
	public double getDelta() {
		return delta;
	}
	public void setDelta(double delta) {
		this.delta = delta;
	}
	public double getXc() {
		return xc;
	}
	public void setXc(double xc) {
		this.xc = xc;
	}
	public double getXe() {
		return xe;
	}
	public void setXe(double xe) {
		this.xe = xe;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	
}
