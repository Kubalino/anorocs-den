package ac.bootcamp.row1game.display;


public final class Sprites {

    // BACKGROUNDS
    final static String CREDITS = "resources/background/background_credits.png";
    final static String GAMEOVER = "resources/background/you_died_background.png";
    final static String GAMEOVERPIC = "resources/background/you_died_picture.png";
    final static String BACKGROUND_1 = "resources/background/bg1.png";
    final static String BACKGROUND_2 = "resources/background/bg2.png";
    final static String BACKGROUND_3 = "resources/background/bg3.png";
    final static String BACKGROUND_4 = "resources/background/bg4.png";
    final static String BACKGROUND_5 = "resources/background/bg5.png";
    final static String INTRO_1 = "resources/background/background_inicial_1.png";
    final static String INTRO_2 = "resources/background/background_inicial_2.png";
    final static String INTRO_3 = "resources/background/background_inicial_3.png";

    final static String[] INTROS = { INTRO_1, INTRO_2, INTRO_3};

    //CRIT
    final static String CRIT = "resources/sprites/critical_hit.png";

    // ACTION BAR
    final static String ACTION_BAR = "resources/sprites/actionBar/action_bar.png";

    // PLAYER
    final static String PLAYER_ATTACK_1 = "resources/sprites/pAttack1.png";
    final static String PLAYER_ATTACK_2 = "resources/sprites/pAttack2.png";

    final static String PLAYER_IDLE_1 = "resources/sprites/player/player_idle_1.png";
    final static String PLAYER_IDLE_2 = "resources/sprites/player/player_idle_2.png";
    final static String PLAYER_IDLE_3 = "resources/sprites/player/player_idle_3.png";
    final static String PLAYER_IDLE_4 = "resources/sprites/player/player_idle_4.png";

    final static String PLAYER_DAMAGE = "resources/sprites/pdamage.png";

    final static String[] PLAYER_DAMAGED = {PLAYER_IDLE_1,PLAYER_DAMAGE,PLAYER_IDLE_1,PLAYER_DAMAGE,PLAYER_IDLE_1,PLAYER_DAMAGE,PLAYER_IDLE_1};


    final static String[] IDLESPRITES = {PLAYER_IDLE_1, PLAYER_IDLE_2, PLAYER_IDLE_3, PLAYER_IDLE_4};
    final static String[] ATTACKSPRITES = {PLAYER_ATTACK_1, PLAYER_ATTACK_2,PLAYER_ATTACK_2, PLAYER_ATTACK_1, PLAYER_IDLE_1};

    // PLAYER ATTACK
    final static String ATTACK_1 = "resources/sprites/pAttackEffect/pA1.png";
    final static String ATTACK_2 = "resources/sprites/pAttackEffect/pA2.png";
    final static String ATTACK_3 = "resources/sprites/pAttackEffect/pA3.png";
    final static String ATTACK_4 = "resources/sprites/pAttackEffect/pA4.png";
    final static String ATTACK_5 = "resources/sprites/pAttackEffect/pA5.png";
    final static String ATTACK_6 = "resources/sprites/pAttackEffect/pA6.png";

    final static String[] ATTACKDONE = {ATTACK_1, ATTACK_2, ATTACK_3, ATTACK_4, ATTACK_5, ATTACK_6};

    // SPELL
    final static String SPELL_1 = "resources/sprites/SpellEffect/spell1.png";
    final static String SPELL_2 = "resources/sprites/SpellEffect/spell2.png";
    final static String SPELL_3 = "resources/sprites/SpellEffect/spell3.png";
    final static String SPELL_4 = "resources/sprites/SpellEffect/spell4.png";
    final static String SPELL_5 = "resources/sprites/SpellEffect/spell5.png";
    final static String SPELL_6 = "resources/sprites/SpellEffect/spell6.png";
    final static String SPELL_7 = "resources/sprites/SpellEffect/spell7.png";
    final static String SPELL_8 = "resources/sprites/SpellEffect/spell8.png";
    final static String SPELL_9 = "resources/sprites/SpellEffect/spell9.png";
    final static String SPELL_10 = "resources/sprites/SpellEffect/spell10.png";

    final static String[] SPELLDONE = {SPELL_1, SPELL_2, SPELL_3, SPELL_4, SPELL_5, SPELL_6, SPELL_7, SPELL_8, SPELL_9, SPELL_10};

    // CHARGING

    final static String CHARGING_1 = "resources/sprites/chargingEffect/charging1.png";
    final static String CHARGING_2 = "resources/sprites/chargingEffect/charging2.png";
    final static String CHARGING_3 = "resources/sprites/chargingEffect/charging3.png";
    final static String CHARGING_4 = "resources/sprites/chargingEffect/charging4.png";

    final static String[] CHARGINGDONE = {CHARGING_1, CHARGING_2, CHARGING_3, CHARGING_4, CHARGING_3, CHARGING_4, CHARGING_3,CHARGING_4,CHARGING_3,CHARGING_2,CHARGING_1 };


    // CHARGED ATTACK
    final static String CHARGE_1 = "resources/sprites/chargedAttack/c1.png";
    final static String CHARGE_2 = "resources/sprites/chargedAttack/c2.png";
    final static String CHARGE_3 = "resources/sprites/chargedAttack/c3.png";
    final static String CHARGE_4 = "resources/sprites/chargedAttack/c4.png";
    final static String CHARGE_5 = "resources/sprites/chargedAttack/c5.png";
    final static String CHARGE_6 = "resources/sprites/chargedAttack/c6.png";
    final static String CHARGE_7 = "resources/sprites/chargedAttack/c7.png";
    final static String CHARGE_8 = "resources/sprites/chargedAttack/c8.png";
    final static String CHARGE_9 = "resources/sprites/chargedAttack/c9.png";

    final static String[] CHARGEDDONE = {CHARGE_1, CHARGE_2, CHARGE_3, CHARGE_4, CHARGE_5, CHARGE_6, CHARGE_5, CHARGE_4, CHARGE_7, CHARGE_8, CHARGE_9};

    // BLOCK
    final static String BLOCK_1 = "resources/sprites/block/block1.png";
    final static String BLOCK_2 = "resources/sprites/block/block2.png";
    final static String BLOCK_3 = "resources/sprites/block/block3.png";
    final static String BLOCK_4 = "resources/sprites/block/block4.png";

    final static String[] BLOCKING = { BLOCK_1, BLOCK_2, BLOCK_3, BLOCK_4, BLOCK_3, BLOCK_2, BLOCK_1};

    // HEAL

    final static String HEAL_1 = "resources/sprites/heal/heal1.png";
    final static String HEAL_2 = "resources/sprites/heal/heal2.png";
    final static String HEAL_3 = "resources/sprites/heal/heal3.png";
    final static String HEAL_4 = "resources/sprites/heal/heal4.png";
    final static String[] HEALING = { HEAL_4, HEAL_3, HEAL_2, HEAL_1, HEAL_2, HEAL_3, HEAL_4};

    // MONSTER A

    final static String MONSTER_A_1 = "resources/sprites/monsterA/monster_a_1.png";
    final static String MONSTER_A_2 = "resources/sprites/monsterA/monster_a_2.png";
    final static String MONSTER_A_3 = "resources/sprites/monsterA/monster_a_3.png";

    final static String[] MONSTER_A_ATK = { MONSTER_A_1, MONSTER_A_2, MONSTER_A_3,MONSTER_A_3, MONSTER_A_2,MONSTER_A_1};

    // MONSTER A DAMAGED

    final static String MONSTER_A_X = "resources/sprites/monsterA/monster_a_x.png";

    final static String[] MONSTER_A_DAMAGED = {MONSTER_A_1,MONSTER_A_X,MONSTER_A_1,MONSTER_A_X,MONSTER_A_1,MONSTER_A_X,MONSTER_A_1};


    // MONSTER B

    final static String MONSTER_B_1 = "resources/sprites/monsterB/monster_b_1.png";
    final static String MONSTER_B_2 = "resources/sprites/monsterB/monster_b_2.png";

    final static  String[] MONSTER_B_ATK = {MONSTER_B_1,MONSTER_B_2,MONSTER_B_2,MONSTER_B_1,MONSTER_B_1,MONSTER_B_2,MONSTER_B_2,MONSTER_B_1};

    // MONSTER B DAMAGED

    final static String MONSTER_B_X = "resources/sprites/monsterB/monster_b_x.png";

    final static String[] MONSTER_B_DAMAGED = {MONSTER_B_1,MONSTER_B_X,MONSTER_B_1,MONSTER_B_X,MONSTER_B_1,MONSTER_B_X,MONSTER_B_1};

    // MONSTER C
    final static String MONSTER_C_1 = "resources/sprites/monsterC/monster_c_1.png";
    final static String MONSTER_C_2 = "resources/sprites/monsterC/monster_c_2.png";
    final static String MONSTER_C_3 = "resources/sprites/monsterC/monster_c_3.png";

    final static String[] MONSTER_C_ATK = { MONSTER_C_1, MONSTER_C_2, MONSTER_C_3,MONSTER_C_3, MONSTER_C_2,MONSTER_C_1};

    // MONSTER C DAMAGED
    final static String MONSTER_C_X = "resources/sprites/monsterC/monster_c_x.png";

    final static String[] MONSTER_C_DAMAGED = {MONSTER_C_1,MONSTER_C_X,MONSTER_C_1,MONSTER_C_X,MONSTER_C_1,MONSTER_C_X,MONSTER_C_1};


    // MONSTER D
    final static String MONSTER_D_1 = "resources/sprites/monsterD/monster_d_1.png";
    final static String MONSTER_D_2 = "resources/sprites/monsterD/monster_d_2.png";
    final static String MONSTER_D_3 = "resources/sprites/monsterD/monster_d_3.png";

    final static String[] MONSTER_D_ATK = { MONSTER_D_1, MONSTER_D_2, MONSTER_D_3,MONSTER_D_3, MONSTER_D_2,MONSTER_D_1};

    // MONSTER D DAMAGED
    final static String MONSTER_D_X = "resources/sprites/monsterD/monster_d_x.png";

    final static String[] MONSTER_D_DAMAGED = {MONSTER_D_1,MONSTER_D_X,MONSTER_D_1,MONSTER_D_X,MONSTER_D_1,MONSTER_D_X,MONSTER_D_1};

    // MONSTER ATTACK
    final static String M_ATTACK_1 = "resources/sprites/mAttackEffect/mA1.png";
    final static String M_ATTACK_2 = "resources/sprites/mAttackEffect/mA2.png";
    final static String M_ATTACK_3 = "resources/sprites/mAttackEffect/mA3.png";
    final static String M_ATTACK_4 = "resources/sprites/mAttackEffect/mA4.png";
    final static String M_ATTACK_5 = "resources/sprites/mAttackEffect/mA5.png";
    final static String M_ATTACK_6 = "resources/sprites/mAttackEffect/mA6.png";

    final static String[] M_ATTACKDONE = {M_ATTACK_1, M_ATTACK_2, M_ATTACK_3, M_ATTACK_4, M_ATTACK_5, M_ATTACK_6};


}
