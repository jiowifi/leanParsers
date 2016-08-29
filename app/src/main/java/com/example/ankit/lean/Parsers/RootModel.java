import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String code_of_conduct;
	public String email;
	public String organizer_description;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String description;
	public CreatorModel _creator;
	public String end_time;
	public String location_name;
	public int id;
	public String name;
	public String topic;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public VersionModel _version;
	public String privacy;
	public String organizer_name;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String logo;

	public RootModel(String start_time, String code_of_conduct, String email, String organizer_description, String state, ArrayList<Social_linksModel> social_links, String timezone, String description, CreatorModel creator, String end_time, String location_name, int id, String name, String topic, String background_image, Call_for_papersModel call_for_papers, String type, VersionModel version, String privacy, String organizer_name, String schedule_published_on, CopyrightModel copyright, String logo) {

		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.organizer_description = organizer_description;
		this.state = state;
		this.social_links = social_links;
		this.timezone = timezone;
		this.description = description;
		this._creator = creator;
		this.end_time = end_time;
		this.location_name = location_name;
		this.id = id;
		this.name = name;
		this.topic = topic;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this._version = version;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.logo = logo;

	}

}