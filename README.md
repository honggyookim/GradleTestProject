# Sample Gradle Web Project for SpringMVC

###### 오류 및 문의사항은 Issues 또는 다이렉트로 전달 주세요.
> #### build.gradle 설정 시 참고 사항
- 웹 프로젝트는 eclipse-wtp 플러그인을 적용하면 eclipse 플러그인도 자동으로 포함됩니다.<br/>
  war 배포를 위한 war 플러그인도 포함시킵니다.
- Project Facet을 build.gradle에 명시하여 별도로 설정하지 않고 Dynamic Web Module로서의 서블릿 스펙을 정의합니다.<br/>
  해당 샘플 프로젝트에서는 서블릿 버전을 4.0, 자바 버전을 1.8로 설정하였습니다.
- dependencies 블록의 의존 모듈은 compile로 정의하는 것이 좋습니다.<br/>
  gradle이 업데이트되면서 compile을 deprecated시키고 실제 안드로이드 스튜디오에서는 implementation을<br/>
  기본 명령어로 사용하고 있지만 웹 프로젝트에서는 compile을 사용하는 것이 좋습니다.
- implementation은 라이브러리의 외부 노출을 허용하지 않고 캡슐화 시켜버립니다. 반면에 compile은 외부에서<br/>
  해당 모듈의 접근을 허용합니다. implementation으로 의존 모듈을 선언하게 되면 외부에서 모듈 접근 허용이 
  불가능하기 때문에 로컬 서버에서 테스트를 할 때 톰캣에서 해당 모듈을 찾을 수 없어 예외가 발생하게 됩니다.<br/>
  따라서 의존 모듈은 일반적으로는 compile로 정의하도록 권장합니다.

<br/>

> #### slf4j 로그를 콘솔에서 적용하기 위한 참고 사항
- resources 폴더에 있는 log4j2.xml파일 내용을 참고하여 Logger 사용 시 해당 클래스 이름과 레벨을 추가하면 됩니다.
- slf4j는 custom color가 지원되지 않습니다.

<br/>

> #### Update History
- 2019-03-05
  - 서블릿 4.0에 맞게 build.gradle 파일이 수정되었습니다.
  - root-context.xml과 servlet-context.xml에 설정에 도움이 되는 설명이 추가되었습니다.
 
- 2019-02-22
  - 서블릿 4.0을 지원하는 web.xml 파일을 추가로 등록하였습니다.


#### 오류 및 문의사항은 Issues 또는 다이렉트로 전달 주세요.
