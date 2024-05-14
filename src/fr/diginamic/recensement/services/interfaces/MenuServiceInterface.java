package fr.diginamic.recensement.services.interfaces;

import java.util.ArrayList;

import fr.diginamic.recensement.models.Departement;
import fr.diginamic.recensement.models.Region;
import fr.diginamic.recensement.models.Ville;

public interface MenuServiceInterface {
  /**
   * Retourne la population d'une ville
   * 
   * @param villes - la liste des villes à consulter : {@link Ville}
   * @return la population de la ville
   */
  public void getCityPopulation(ArrayList<Ville> villes);

  /**
   * Retourne la population d'un departement
   * 
   * @param departement - le departement à consulter : {@link Departement}
   * @return la population du departement
   */
  public void getDepartmentPopulation(ArrayList<Ville> villes);

  /**
   * Retourne la population d'une region
   * 
   * @param region - la region à consulter : {@link Region}
   * @return la population de la region
   */
  public void getRegionPopulation(ArrayList<Ville> villes);

  /**
   * Retourne les 10 regions les plus peuplees
   * 
   * @return la liste des regions
   */
  public void getPopularRegions(ArrayList<Ville> villes);

  /**
   * Retourne les 10 département les plus peuplees
   * 
   * @return la liste des départements
   */
  public void getPopularDepartments(ArrayList<Ville> villes);

  /**
   * Retourne les 10 villes les plus peuplees d'un departement
   * 
   * @return la liste des villes
   */
  public void getPopularCityByDepartments(ArrayList<Ville> villes);

  /**
   * Retourne les 10 villes les plus peuplees d'une region
   * 
   * @return la liste des villes
   */
  public void getPopularCityByRegions(ArrayList<Ville> villes);

  /**
   * Retourne les 10 villes les plus peuplees de la France
   * 
   * @return la liste des villes
   */
  public void getPopularFrenchCities(ArrayList<Ville> villes);
}
