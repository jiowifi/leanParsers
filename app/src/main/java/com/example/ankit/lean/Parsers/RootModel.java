import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String organizer_description;
	public String background_image;
	public int id;
	public String privacy;
	public String description;
	public String organizer_name;
	public String name;
	public String state;
	public CopyrightModel _copyright;
	public String type;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public CreatorModel _creator;
	public String end_time;
	public String email;
	public String timezone;
	public String code_of_conduct;
	public String schedule_published_on;
	public VersionModel _version;
	public String topic;

	public RootModel(Call_for_papersModel call_for_papers, String location_name, String organizer_description, String background_image, int id, String privacy, String description, String organizer_name, String name, String state, CopyrightModel copyright, String type, String start_time, ArrayList<Social_linksModel> social_links, String logo, CreatorModel creator, String end_time, String email, String timezone, String code_of_conduct, String schedule_published_on, VersionModel version, String topic) {

		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.id = id;
		this.privacy = privacy;
		this.description = description;
		this.organizer_name = organizer_name;
		this.name = name;
		this.state = state;
		this._copyright = copyright;
		this.type = type;
		this.start_time = start_time;
		this.social_links = social_links;
		this.logo = logo;
		this._creator = creator;
		this.end_time = end_time;
		this.email = email;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.topic = topic;

	}

}