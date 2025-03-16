Feature: Registartion process

  Scenario: To validate registration process on Rediff website
    Given Launch rediff website
    When I pass the data as follows
      | Nilima | nilima@rediff.com | nilima123 | 1234567892 |
      | Durga  | durga@rediff.com  | durga123  | 3456778997 |
      | Radha  | radha@rediff.com  | radha123  | 4567865543 |
      | Mona   | mona@rediff.com   | mona123   | 6521221356 |
    Then registration process should success

  Scenario: To validate registration process on Rediff via title
    When I pass the following data
      | Name  | Email Id         | Password | MobileNo   |
      | Dada  | dada@rediff.com  | dada123  | 3456778997 |
      | Ram   | ram@rediff.com   | ram123   | 4567865543 |
      | Manav | manav@rediff.com | manav123 | 6577721356 |
    Then Registration success
