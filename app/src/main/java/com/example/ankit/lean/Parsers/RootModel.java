import java.util.ArrayList;

class RootModel {

	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String code_of_conduct;
	public String description;
	public String email;
	public String background_image;
	public String type;
	public String organizer_name;
	public String logo;
	public String state;
	public String name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String privacy;
	public int id;
	public String topic;
	public String organizer_description;

	public RootModel(String end_time, ArrayList<Social_linksModel> social_links, String start_time, String code_of_conduct, String description, String email, String background_image, String type, String organizer_name, String logo, String state, String name, String schedule_published_on, CreatorModel creator, VersionModel version, CopyrightModel copyright, String timezone, Call_for_papersModel call_for_papers, String location_name, String privacy, int id, String topic, String organizer_description) {

		this.end_time = end_time;
		this.social_links = social_links;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.email = email;
		this.background_image = background_image;
		this.type = type;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.state = state;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._version = version;
		this._copyright = copyright;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.privacy = privacy;
		this.id = id;
		this.topic = topic;
		this.organizer_description = organizer_description;

	}

}