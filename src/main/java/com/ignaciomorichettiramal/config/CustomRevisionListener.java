package com.ignaciomorichettiramal.config;

import org.hibernate.envers.RevisionListener;

import com.ignaciomorichettiramal.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener {
    public void newRevision(Object revisionEntity) { final Revision revision = (Revision)  revisionEntity;}
}

