import java.util.ArrayList;

class RootModel {

	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String start_time;
	public VersionModel _version;
	public String end_time;
	public String logo;
	public String location_name;
	public String timezone;
	public String organizer_description;
	public int id;
	public String description;
	public String organizer_name;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String type;
	public String name;
	public CreatorModel _creator;
	public String email;

	public RootModel(String privacy, Call_for_papersModel call_for_papers, String topic, String start_time, VersionModel version, String end_time, String logo, String location_name, String timezone, String organizer_description, int id, String description, String organizer_name, String background_image, ArrayList<Social_linksModel> social_links, String state, String schedule_published_on, CopyrightModel copyright, String code_of_conduct, String type, String name, CreatorModel creator, String email) {

		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.start_time = start_time;
		this._version = version;
		this.end_time = end_time;
		this.logo = logo;
		this.location_name = location_name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.id = id;
		this.description = description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.social_links = social_links;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.name = name;
		this._creator = creator;
		this.email = email;

	}

}