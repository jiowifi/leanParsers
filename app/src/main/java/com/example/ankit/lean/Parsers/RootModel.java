import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String topic;
	public String code_of_conduct;
	public String location_name;
	public String timezone;
	public String name;
	public VersionModel _version;
	public int id;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String description;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String logo;
	public String organizer_description;
	public String background_image;
	public String email;
	public String end_time;
	public String start_time;
	public CopyrightModel _copyright;
	public String organizer_name;

	public RootModel(String privacy, String topic, String code_of_conduct, String location_name, String timezone, String name, VersionModel version, int id, String schedule_published_on, Call_for_papersModel call_for_papers, CreatorModel creator, String description, String type, ArrayList<Social_linksModel> social_links, String state, String logo, String organizer_description, String background_image, String email, String end_time, String start_time, CopyrightModel copyright, String organizer_name) {

		this.privacy = privacy;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.timezone = timezone;
		this.name = name;
		this._version = version;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.description = description;
		this.type = type;
		this.social_links = social_links;
		this.state = state;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.email = email;
		this.end_time = end_time;
		this.start_time = start_time;
		this._copyright = copyright;
		this.organizer_name = organizer_name;

	}

}