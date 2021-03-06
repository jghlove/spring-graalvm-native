package javax.xml.transform;

import com.oracle.svm.core.annotate.Delete;
import com.oracle.svm.core.annotate.TargetClass;

import org.springframework.graalvm.substitutions.OnlyIfPresent;
import org.springframework.graalvm.substitutions.RemoveXmlSupport;

@TargetClass(className = "javax.xml.transform.FactoryFinder", onlyWith = { OnlyIfPresent.class, RemoveXmlSupport.class })
@Delete
final class Target_FactoryFinder {
}

