package org.xtext.example.mydsl

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import com.google.inject.Inject
import org.xtext.example.mydsl.fML.ViewDef
import org.xtext.example.mydsl.fML.EditionPattern
import org.junit.Test
import static org.junit.Assert.*
import org.xtext.example.mydsl.fML.VirtualModel

@InjectWith(FMLInjectorProvider)
@RunWith(XtextRunner)
class FMLUnitTest {
	@Inject
	ParseHelper<ViewDef> parser
	
    @Test
    def void testEditionPattern() {
	val model = parser.parse(
		'''
		ViewDefinition va uri = "http://jdlsjlq" {
	        VirtualModel vm type = VirtualModel uri = "http://jslqjdl" {
		       EditionPattern Z {
		       }
		       EditionPattern E extends Z{
		       }
	        }
         }
         
         '''
         )
         
    //test VirtualModel name     
	val virtualModel = model.elements.head as VirtualModel
	assertEquals("vm", virtualModel.name)
	
	val vmIterator = virtualModel.editionPatterns.iterator
	
	//test EditionPattern name
	val editionPatternZ = vmIterator.next() as EditionPattern;
	assertEquals("Z", editionPatternZ.name)
	
	//test SuperEditionPattern name
	val editionPatternE = vmIterator.next() as EditionPattern;
	assertEquals("Z", editionPatternE.superEditionPattern.name)
	
	}

}