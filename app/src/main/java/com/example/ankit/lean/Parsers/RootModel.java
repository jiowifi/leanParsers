import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String organizer_description;
	public String timezone;
	public String privacy;
	public String email;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String end_time;
	public int id;
	public String description;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String logo;
	public String code_of_conduct;
	public String organizer_name;
	public String start_time;
	public String name;
	public String topic;
	public CopyrightModel _copyright;
	public String background_image;
	public String schedule_published_on;

	public RootModel(String location_name, String organizer_description, String timezone, String privacy, String email, String state, Call_for_papersModel call_for_papers, String type, String end_time, int id, String description, VersionModel version, ArrayList<Social_linksModel> social_links, CreatorModel creator, String logo, String code_of_conduct, String organizer_name, String start_time, String name, String topic, CopyrightModel copyright, String background_image, String schedule_published_on) {

		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.privacy = privacy;
		this.email = email;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.end_time = end_time;
		this.id = id;
		this.description = description;
		this._version = version;
		this.social_links = social_links;
		this._creator = creator;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.name = name;
		this.topic = topic;
		this._copyright = copyright;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;

	}

}