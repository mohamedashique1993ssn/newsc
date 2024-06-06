package com.sc.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.mapping.Set;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Ransom {
	
	@Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
	
	@ElementCollection
	private List<String> name;
    @Column(columnDefinition="text")
    private String extensions;
    private String extensionPattern;
    @Column(columnDefinition="text")
    private String ransomNoteFilenames;
    private String comment;
    private String encryptionAlgorithm;
    private String decryptor;
    
 
    @ElementCollection
    @Column(columnDefinition="text")
    private List<String> resources;
    
    @Column(columnDefinition="text")
	private String screenshots;
    
    private String microsoftDetectionName;
    @Column(columnDefinition="text")
    
    private String microsoftInfo;
    private String sandbox;
    private String iocs;
    private String snort;

    public Ransom() {}
}
