def cigar_party(cigars, is_weekend):
  if not is_weekend and cigars > 60 or cigars < 40:
    return False
  return True
