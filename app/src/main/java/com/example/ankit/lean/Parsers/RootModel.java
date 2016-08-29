import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String start_time;
	public String type;
	public String privacy;
	public String name;
	public String email;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public int id;
	public String logo;
	public String location_name;
	public String end_time;
	public String code_of_conduct;
	public String description;
	public String organizer_description;
	public String state;
	public CreatorModel _creator;
	public String background_image;
	public String organizer_name;
	public String schedule_published_on;

	public RootModel(CopyrightModel copyright, String start_time, String type, String privacy, String name, String email, String timezone, ArrayList<Social_linksModel> social_links, String topic, Call_for_papersModel call_for_papers, VersionModel version, int id, String logo, String location_name, String end_time, String code_of_conduct, String description, String organizer_description, String state, CreatorModel creator, String background_image, String organizer_name, String schedule_published_on) {

		this._copyright = copyright;
		this.start_time = start_time;
		this.type = type;
		this.privacy = privacy;
		this.name = name;
		this.email = email;
		this.timezone = timezone;
		this.social_links = social_links;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.id = id;
		this.logo = logo;
		this.location_name = location_name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.organizer_description = organizer_description;
		this.state = state;
		this._creator = creator;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;

	}

}