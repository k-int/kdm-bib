package com.k_int.dm.resdesc;


public class ResourceDescription {

  String demo

  // Given "T:Some Book and A:Some Author" - To look up, this uniquely identifies both T & A
  // To create - it does not
  // Creating on demand is perhaps not such a great idea
  // But how do we bootstrap? - Can we create and repair later
  //     repair = Separate out things that hashed together (Add discrminating properties)
  //            = Join things that hashed separately
  // Journals?
  // Hash values are not the same as explicit FK links? Or used for the same purpose.
  // Corrections by FK links?
  //
  // Must be data driven hashing policy
  // Reindex must be possible

  static constraints = {
    // example nullable:false, blank: false
  }

  static mapping = {
    // table 'ki_refdata_value'
    id column:'rd_id'
  }
}
