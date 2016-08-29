import java.util.ArrayList;

class RootModel {

	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String location_name;
	public String end_time;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String logo;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String name;
	public String email;
	public String description;
	public String privacy;
	public String background_image;
	public String schedule_published_on;
	public String type;
	public String organizer_name;
	public CreatorModel _creator;
	public String topic;
	public String state;

	public RootModel(String start_time, ArrayList<Social_linksModel> social_links, int id, String location_name, String end_time, String organizer_description, CopyrightModel copyright, String code_of_conduct, String logo, String timezone, Call_for_papersModel call_for_papers, VersionModel version, String name, String email, String description, String privacy, String background_image, String schedule_published_on, String type, String organizer_name, CreatorModel creator, String topic, String state) {

		this.start_time = start_time;
		this.social_links = social_links;
		this.id = id;
		this.location_name = location_name;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.name = name;
		this.email = email;
		this.description = description;
		this.privacy = privacy;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.topic = topic;
		this.state = state;

	}

}