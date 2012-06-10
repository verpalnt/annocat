package de.verpalnt.annocat.spi;

import de.verpalnt.annocat.api.ICategoryFacilityFactory;

import java.util.List;

/**
 * @author PaL
 *         Date: 08.06.12
 *         Time: 15:25
 */
public interface ICategoryFacilityFactoryProvider
{

  List<ICategoryFacilityFactory> get();

}