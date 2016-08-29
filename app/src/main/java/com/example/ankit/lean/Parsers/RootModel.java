import java.util.ArrayList;

class RootModel {

	public String name;
	public String logo;
	public String state;
	public String start_time;
	public String location_name;
	public String organizer_description;
	public String code_of_conduct;
	public String organizer_name;
	public CreatorModel _creator;
	public int id;
	public String end_time;
	public String schedule_published_on;
	public String topic;
	public String description;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public VersionModel _version;
	public String timezone;
	public CopyrightModel _copyright;
	public String type;

	public RootModel(String name, String logo, String state, String start_time, String location_name, String organizer_description, String code_of_conduct, String organizer_name, CreatorModel creator, int id, String end_time, String schedule_published_on, String topic, String description, String background_image, Call_for_papersModel call_for_papers, String privacy, ArrayList<Social_linksModel> social_links, String email, VersionModel version, String timezone, CopyrightModel copyright, String type) {

		this.name = name;
		this.logo = logo;
		this.state = state;
		this.start_time = start_time;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.id = id;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.description = description;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.social_links = social_links;
		this.email = email;
		this._version = version;
		this.timezone = timezone;
		this._copyright = copyright;
		this.type = type;

	}

}