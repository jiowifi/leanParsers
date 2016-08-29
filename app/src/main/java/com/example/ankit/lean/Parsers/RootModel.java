import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String state;
	public String name;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String organizer_description;
	public String schedule_published_on;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public CreatorModel _creator;
	public String end_time;
	public String topic;
	public String logo;
	public String description;
	public String organizer_name;
	public String type;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String email;
	public String timezone;
	public VersionModel _version;

	public RootModel(String start_time, String state, String name, int id, Call_for_papersModel call_for_papers, String privacy, String organizer_description, String schedule_published_on, String location_name, ArrayList<Social_linksModel> social_links, String background_image, CreatorModel creator, String end_time, String topic, String logo, String description, String organizer_name, String type, CopyrightModel copyright, String code_of_conduct, String email, String timezone, VersionModel version) {

		this.start_time = start_time;
		this.state = state;
		this.name = name;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.social_links = social_links;
		this.background_image = background_image;
		this._creator = creator;
		this.end_time = end_time;
		this.topic = topic;
		this.logo = logo;
		this.description = description;
		this.organizer_name = organizer_name;
		this.type = type;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.timezone = timezone;
		this._version = version;

	}

}