import java.util.ArrayList;

class RootModel {

	public String type;
	public String topic;
	public String background_image;
	public String description;
	public CopyrightModel _copyright;
	public String email;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String name;
	public int id;
	public String start_time;
	public String organizer_description;
	public String state;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String code_of_conduct;
	public String timezone;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public VersionModel _version;
	public String end_time;

	public RootModel(String type, String topic, String background_image, String description, CopyrightModel copyright, String email, String privacy, ArrayList<Social_linksModel> social_links, String location_name, String name, int id, String start_time, String organizer_description, String state, CreatorModel creator, String schedule_published_on, String code_of_conduct, String timezone, String organizer_name, Call_for_papersModel call_for_papers, String logo, VersionModel version, String end_time) {

		this.type = type;
		this.topic = topic;
		this.background_image = background_image;
		this.description = description;
		this._copyright = copyright;
		this.email = email;
		this.privacy = privacy;
		this.social_links = social_links;
		this.location_name = location_name;
		this.name = name;
		this.id = id;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.state = state;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this._version = version;
		this.end_time = end_time;

	}

}