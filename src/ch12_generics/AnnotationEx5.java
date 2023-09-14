package ch12_generics;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated // 앞으로 사용X 의미
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시됨
// 애노테이션 적용 시, 요소들의 값을 지정해주고 이름도 적어야함
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))
public class AnnotationEx5 {
	public static void main(String[] args) {
		Class<AnnotationEx5> cls = AnnotationEx5.class; // AnnotationEx5의 Class객체를 얻음

		TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class); // AnnotationEx5에 적용된 @TestInfo의 정보를 얻음
		System.out.println("anno.testedBy()=" + anno.testedBy());
		System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()=" + anno.testDate().hhmmss());

		for (String str : anno.testTools())
			System.out.println("testTools=" + str);
		System.out.println();

		// AnnotationEx5에 적용된 모든 애노테이션을 가져옴
		Annotation[] annoArr = cls.getAnnotations();

		for (Annotation a : annoArr)
			System.out.println(a);
	}
}

@Retention(RetentionPolicy.RUNTIME) // 실행 시에 사용가능하도록 설정
@interface TestInfo { // 새로운 애노테이션 정의
	// 애노테이션 요소
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME) // 메타애노테이션
@interface DateTime { // 새로운 애노테이션 정의
	// 애노테이션 요소
	String yymmdd();
	String hhmmss();
}


enum TestType {
	FIRST, FINAL
}
