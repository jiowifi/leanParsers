import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String location_name;
	public int id;
	public String type;
	public CreatorModel _creator;
	public String privacy;
	public String code_of_conduct;
	public String schedule_published_on;
	public String organizer_name;
	public String end_time;
	public String topic;
	public String timezone;
	public CopyrightModel _copyright;
	public String logo;
	public String state;
	public String description;
	public String start_time;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;

	public RootModel(VersionModel version, String location_name, int id, String type, CreatorModel creator, String privacy, String code_of_conduct, String schedule_published_on, String organizer_name, String end_time, String topic, String timezone, CopyrightModel copyright, String logo, String state, String description, String start_time, String name, ArrayList<Social_linksModel> social_links, String background_image, String email, Call_for_papersModel call_for_papers, String organizer_description) {

		this._version = version;
		this.location_name = location_name;
		this.id = id;
		this.type = type;
		this._creator = creator;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.topic = topic;
		this.timezone = timezone;
		this._copyright = copyright;
		this.logo = logo;
		this.state = state;
		this.description = description;
		this.start_time = start_time;
		this.name = name;
		this.social_links = social_links;
		this.background_image = background_image;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;

	}

}