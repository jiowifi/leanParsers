import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String state;
	public String organizer_description;
	public CopyrightModel _copyright;
	public int id;
	public String end_time;
	public String name;
	public String description;
	public String timezone;
	public VersionModel _version;
	public CreatorModel _creator;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String background_image;
	public String organizer_name;
	public String start_time;
	public String type;
	public String schedule_published_on;
	public String privacy;
	public String logo;
	public String email;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String code_of_conduct, String state, String organizer_description, CopyrightModel copyright, int id, String end_time, String name, String description, String timezone, VersionModel version, CreatorModel creator, String topic, Call_for_papersModel call_for_papers, String location_name, String background_image, String organizer_name, String start_time, String type, String schedule_published_on, String privacy, String logo, String email, ArrayList<Social_linksModel> social_links) {

		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.id = id;
		this.end_time = end_time;
		this.name = name;
		this.description = description;
		this.timezone = timezone;
		this._version = version;
		this._creator = creator;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.logo = logo;
		this.email = email;
		this.social_links = social_links;

	}

}