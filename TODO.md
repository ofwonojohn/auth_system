# TODO: Fix Imports and Syntax Errors in Auth System Project

- [x] Fix UserService.java: Add missing imports (UserRepository, BCryptPasswordEncoder, User, RuntimeException) and correct typos (idPresent -> isPresent, RuntieException -> RuntimeException, encoder.encoder -> encoder.encode)
- [x] Fix User.java: Add JPA imports (@Entity, @Id, @GeneratedValue, @Column) and fix @GeneratedValue(strategy = ...)
- [ ] Fix AuthController.java: Add Spring MVC imports (@GetMapping, @PostMapping, @RequestParam, HttpSession, Model), fix syntax (remove trailing comma, add Model parameter)
- [ ] Fix UserRepository.java: Add package declaration, imports (JpaRepository, Optional, User), fix typos (JpaRepositroy -> JpaRepository, optional -> Optional)
- [ ] Fix SecurityConfig.java: Add @Configuration import and fix annotation case
- [x] Compile the project to verify no red underlines remain
