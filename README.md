# springboot-playground

## LAZY Initialization
* 컨텍스트 로드보단 필요시 빈 생성된다.
* 단점으로는
    * 빈 설정에 문제가 있을경우 startup 시 발견이 되지 않는다.
    * startup 시 JVM 이 전체 빈에 대한 충분한 메모리 영역이 준비되어 있는지 확인이 필요하다.
* 위의 단점으로 인해 기본값은 `false` 이고 활성화 이전에 JVM 의 힙 사이즈 조정이 필요하다.
 