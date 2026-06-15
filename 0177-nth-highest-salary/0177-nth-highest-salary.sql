CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
 declare k int;
    set k = n-1;
  RETURN (
      select distinct salary from employee order by salary desc limit 1 offset k

  );
END