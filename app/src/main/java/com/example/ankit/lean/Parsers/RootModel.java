import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String type;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public CreatorModel _creator;
	public String location_name;
	public String code_of_conduct;
	public String organizer_name;
	public String timezone;
	public VersionModel _version;
	public String organizer_description;
	public String background_image;
	public String topic;
	public String email;
	public String state;
	public String description;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public int id;
	public String name;
	public String end_time;

	public RootModel(String schedule_published_on, String type, CopyrightModel copyright, Call_for_papersModel call_for_papers, String start_time, CreatorModel creator, String location_name, String code_of_conduct, String organizer_name, String timezone, VersionModel version, String organizer_description, String background_image, String topic, String email, String state, String description, String logo, ArrayList<Social_linksModel> social_links, String privacy, int id, String name, String end_time) {

		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this._creator = creator;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._version = version;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.topic = topic;
		this.email = email;
		this.state = state;
		this.description = description;
		this.logo = logo;
		this.social_links = social_links;
		this.privacy = privacy;
		this.id = id;
		this.name = name;
		this.end_time = end_time;

	}

}