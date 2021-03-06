/**
 *
 * Copyright (C) 2011 Cloud Conscious, LLC. <info@cloudconscious.com>
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */
package org.jclouds.openstack.swift.domain;

import javax.annotation.Nullable;

import org.jclouds.io.PayloadEnclosing;

import com.google.common.collect.Multimap;

/**
 * 
 * @author Adrian Cole
 */
public interface SwiftObject extends PayloadEnclosing, Comparable<SwiftObject> {
   public interface Factory {
      SwiftObject create(@Nullable MutableObjectInfoWithMetadata info);
   }

   /**
    * @return System and User metadata relevant to this object.
    */
   MutableObjectInfoWithMetadata getInfo();

   Multimap<String, String> getAllHeaders();

   void setAllHeaders(Multimap<String, String> allHeaders);
}
