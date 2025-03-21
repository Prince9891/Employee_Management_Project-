package org.sumitkumar.emproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
        private Long id;
        private String name;
        private String phone;
        private String email;
}
