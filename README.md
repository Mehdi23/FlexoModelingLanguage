FlexoModelingLanguage
=====================

xtext grammar and tooling for FML(Flexo Modeling Language)


1- installez xtext dans votre eclipse : http://www.eclipse.org/Xtext/

2- copiez le répertoire git sur votre machine, et importez les 4 projets dans votre workplace.

3- basculez sur le "project explorer", puis vous lancez :

        Run Configurations / MWe2Lanche / Generate Language Infrastructure

4- lancez : run as / Eclipse Application.

5- vous aurez une nouvelle fenetre d'Eclipse, dans laquelle vous pouvez créer un projet vide, dans lequel vous créez un fichier vide.

6- cliquez droit sur ce fichier --> open with --> others --> FML Editor

=======================================================================================================================

vous pouvez maintenant écrire en langage FML :

     ViewDefinition CityMapping uri="http://www.thalesgroup.com/openflexo/emf/CityMapping" { 
         VirtualModel CityMapping type=VirtualModel uri="http://www.thalesgroup.com/openflexo/emf/CityMapping/CityMapping" {
            ModelSlot model1 type=EMFModelSlot conformTo="http://www.thalesgroup.com/openflexo/emf/model/city1" required=true readOnly=false;  
            ModelSlot model2 type=EMFModelSlot conformTo="http://www.thalesgroup.com/openflexo/emf/model/city2" required=true readOnly=false;
            EditionPattern City {  
                PatternRole cityInModel1 as Individual conformTo "City" from model1 ;  
                PatternRole cityInModel2 as Individual conformTo "City" from model2 ;  
                
                CreationScheme creation(Individual:City cityInModel1, Individual:City cityInModel2) {    
                     cityInModel1 = parameters.cityInModel1;  
                     cityInModel2 = parameters.cityInModel2;    
                }    
                
                ActionScheme generateModel2FromModel1() {    
                     cityInModel2 = ( AddEMFObjectIndividual conformTo City from model2 {      
                     //name = cityInModel1.name;      
                     })       
                }    
                
                ActionScheme generateModel1FromModel2() {    
                     AddEMFObjectIndividual conformTo City from model1 {      
                     //name = cityInModel2.name;      
                     }    
                }  
                
                DeletionScheme deletion() {    
                     delete cityInModel1;    
                     delete cityInModel2;   
                }    
           }    
        }
     }
  
