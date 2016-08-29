import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String location_name;
	public String email;
	public String logo;
	public String state;
	public String organizer_description;
	public String description;
	public String start_time;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String privacy;
	public int id;
	public String schedule_published_on;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String background_image;
	public CreatorModel _creator;
	public String type;

	public RootModel(String end_time, String code_of_conduct, CopyrightModel copyright, VersionModel version, String location_name, String email, String logo, String state, String organizer_description, String description, String start_time, String name, Call_for_papersModel call_for_papers, String topic, String privacy, int id, String schedule_published_on, String organizer_name, ArrayList<Social_linksModel> social_links, String timezone, String background_image, CreatorModel creator, String type) {

		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._version = version;
		this.location_name = location_name;
		this.email = email;
		this.logo = logo;
		this.state = state;
		this.organizer_description = organizer_description;
		this.description = description;
		this.start_time = start_time;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.privacy = privacy;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.timezone = timezone;
		this.background_image = background_image;
		this._creator = creator;
		this.type = type;

	}

}