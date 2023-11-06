package org.launchcode.techjobs.persistent.models.data;

import org.launchcode.techjobs.persistent.models.Employer;
import org.launchcode.techjobs.persistent.models.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//In the line below, I had to change <Employer, String> to <Employer, Integer> to satisfy Optional<Employer> optEmployer = employerRepository.findById(employerId); in employercontroller
@Repository
public interface EmployerRepository extends CrudRepository<Employer, Integer> {

}
