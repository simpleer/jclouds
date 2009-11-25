/**
 *
 * Copyright (C) 2009 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 */
package org.jclouds.rimuhosting.miro.domain.internal;

import java.sql.Timestamp;

/**
 * Handles a timestamp JSON object from rimuhosting
 */
public class RimuHostingTimestamp {
   private Long ms_since_epoch;

   public Long getMs() {
      return ms_since_epoch;
   }

   public void setMs(Long ms_since_epoch) {
      this.ms_since_epoch = ms_since_epoch;
   }

   public Timestamp getTimestamp(){
      return new Timestamp(ms_since_epoch);
   }
}