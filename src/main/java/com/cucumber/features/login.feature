Feature: Login Program Kompetisi Kampus Merdeka (PKKM)

  Scenario: Masuk akun yang telah terdaftar
    Given Admin opens PKKM Dikti Kemendikbud page
    And Admin verifies direct to Beranda page
    When Admin clicks Masuk button on navbar
    Then Admin verifies redirect to Masuk page
    When Admin inputs username "admin1"
    When Admin inputs password "EjPTYqEixf"
    When Admin clicks Masuk button