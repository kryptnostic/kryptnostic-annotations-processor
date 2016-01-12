package com.kryptnostic.annotations.processors;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

import com.kryptnostic.annotations.UserId;

@SupportedAnnotationTypes(
    value = "com.kryptnostic.annotations.UserId" )
@SupportedSourceVersion( SourceVersion.RELEASE_7 )
public class UserIdProcessor extends AbstractProcessor {
    
    @Override
    public boolean process( Set<? extends TypeElement> annotations, RoundEnvironment roundEnv ) {
        Set<? extends Element> elements = roundEnv.getElementsAnnotatedWith( UserId.class );
        for ( Element e : elements ) {
            String message = "annotation found in " + e.getSimpleName();
            processingEnv.getMessager().printMessage( Diagnostic.Kind.WARNING, message, e );
        }
        return true;
    }

    
}
